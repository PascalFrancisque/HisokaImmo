package com.edu.realestate.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.jdbc.ReturningWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;
import com.edu.realestate.model.SearchCriteria;
import com.mysql.cj.jdbc.CallableStatement;

@Repository
public class SearchDaoHib extends AbstractDaoHib implements SearchDAO {
	
	@Autowired
	CityDAO cityDao;
	
	private static final Logger LOGGER = LogManager.getLogger(SearchDaoHib.class);
	
	@Override
	public List<Advertisement> search(SearchCriteria sc) {

		List<Advertisement>advs = null;
		
		try (Session session = getSession()) {
			
			String prehql = "from Advertisement a where a.id > 0 ";
			boolean prefix = true;

			if (sc.getAreaMax() > 0) {
				if (prefix)
					prehql += "AND";
				prehql += " a.realEstate.area <= " + sc.getAreaMax();
				prefix = true;
			}

			if (sc.getAreaMin() > 0) {
				if (prefix)
					prehql += "AND";
				prehql += " a.realEstate.area >= " + sc.getAreaMin();
				prefix = true;
			}

			if (sc.getPriceMax() > 0) {
				if (prefix)
					prehql += "AND";
				prehql += " a.realEstate.price <= " + sc.getPriceMax();
				prefix = true;
			}

			if (sc.getPriceMin() > 0) {
				if (prefix)
					prehql += "AND";
				prehql += " a.realEstate.price >= " + sc.getPriceMin();
				prefix = true;
			}

			if (sc.getCityId() > 0) {
				if (prefix)
					prehql += "AND";
				prehql += " a.realEstate.city.id = " + sc.getCityId();
				prefix = true;
			}

			if (!sc.getQuery().isEmpty()) {
				if (prefix)
					prehql += "AND";
				prehql += " (a.description like '%" + sc.getQuery() + "%' OR a.title like '%" + sc.getQuery() + "%') ";
				prefix = true;
			}

			
			if ( sc.getDistance()>0 && sc.getCityId()>0 ) {
				
			int maxKm = Math.min(50, sc.getDistance());	
			List<Integer> ids = null;
			
			City cityCentrale = cityDao.read(sc.getCityId());
			ReturningWork<List<Integer>> rw = new ReturningWork<List<Integer>>() {

				@Override
				public List<Integer> execute(Connection connection) throws SQLException {
					try (CallableStatement function = (CallableStatement) connection.prepareCall(
						"SELECT id FROM City c WHERE distKM(?, ?, c.latitude, c.longitude ) < ?")) {
						function.setDouble(1, cityCentrale.getLatitude());
						function.setDouble(2, cityCentrale.getLongitude());
						function.setDouble(3, maxKm);
						
						function.execute();
						
						ArrayList<Integer> ids = new ArrayList(); 
						
					}
					
					return ids;
				};
			};
		}

		advs = session.createQuery(prehql).setMaxResults(100).list();
		} catch (Exception ex) {
			advs = new ArrayList<Advertisement>();
			LOGGER.error(ex);
			}
		
		return advs;
	}

}
