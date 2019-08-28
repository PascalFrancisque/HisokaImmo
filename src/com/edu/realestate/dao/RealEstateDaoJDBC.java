package com.edu.realestate.dao;

import java.sql.ResultSet;

import java.sql.Statement;

import com.edu.realestate.mapping.RealEstateMapper;
import com.edu.realestate.model.City;
import com.edu.realestate.model.RealEstate;


public class RealEstateDaoJDBC extends AbstractDaoJDBC implements RealEstateDAO {

	@Override
	public void create(RealEstate t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(RealEstate t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(RealEstate t) {
		// TODO Auto-generated method stub

	}

	@Override
	public RealEstate read(Integer id) {

		RealEstate re = null;
		try {

			String query = "SELECT nomcolonne FROM 'allproperties' WHERE id = real_estate_id " + id;
			Statement st = getConnection().createStatement();
			ResultSet rs = st.executeQuery(query);
			String tableName = null;
			String typeBien = null;
			if (rs.next()) {
				typeBien = rs.getString("nomcolonne");
				tableName = RealEstateMapper.tableFromType(typeBien);
			}

			if (tableName != null) {
				String query2 = "SELECT r.*, b.* from real_estate as r JOIN" + tableName + "b ON r.id= b.id";
				Statement st2 = getConnection().createStatement();
				ResultSet rs2 = st2.executeQuery(query2);

				if (rs2.next()) {
					re = RealEstateMapper.resulToRealEstate(rs2, typeBien);
					CityDAO cdao = new CityDaoJDBC();
					City city = cdao.read(rs2.getInt("city_id"));
					re.setCity(city);

				}
			}

		} catch (Exception e) {
			e.getLocalizedMessage();
		}

		return re;

	}

}
