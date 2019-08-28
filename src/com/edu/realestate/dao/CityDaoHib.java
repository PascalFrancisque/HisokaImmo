package com.edu.realestate.dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;

@Repository
@Qualifier("hibernate")
public class CityDaoHib extends AbstractDaoHib implements CityDAO {

	private final static Logger LOGGER = LogManager.getLogger(CityDaoHib.class);

	@Override
	public void create(City city) {
		Session session = getSession();
		session.save(city);
	}

	@Override
	@Transactional(readOnly = true)
	public City read(Integer id) {
		City city = null;
		Session session = getSession();
		city = session.load(City.class, id);
		return city;
	}

	@Override
	public void update(City city) {
		Session session = getSession();
		session.update(city);	
	}

	@Override
	public void delete(City city) {
		Session session = getSession();
		session.delete(city);
	}

	@Override
	public List<City> listAll() {
		List<City> cities = null;
		Session session = getSession();
		cities = session.createQuery("from City", City.class).list();
		return cities;
	}

	@Override
	public List<City> findCitiesByName(String name) {
		Session session = getSession();
		String hql = "select c from City c " 
		+ "where c.name = :name";
		
		Query<City> query = session.createQuery(hql, City.class);
		query.setParameter("name", name);
		
		List<City> cities = query.getResultList();
		return cities;
	}

}
