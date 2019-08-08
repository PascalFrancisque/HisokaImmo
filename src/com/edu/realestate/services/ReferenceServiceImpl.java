package com.edu.realestate.services;

import java.util.List;

import com.edu.realestate.dao.CityDAO;
import com.edu.realestate.dao.CityDaoJDBC;
import com.edu.realestate.dao.SearchDAO;
import com.edu.realestate.dao.SearchDaoJDBC;
import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;
import com.edu.realestate.model.SearchCriteria;

public class ReferenceServiceImpl implements ReferenceService {

	SearchDAO searchDao = new SearchDaoJDBC();
	CityDAO cityDao = new CityDaoJDBC();
	
	
	@Override
	public List<City> listCities() {
	   List<City> cities = cityDao.listAll();
	   return cities; 
	}

	@Override
	public List<City> findCitiesByName(String city) throws RealEstateException {
		List<City> cities = cityDao.findCitiesByName(city);
		return cities;
	}

	@Override
	public List<Advertisement> findAdsByCriteria(SearchCriteria criteria) throws RealEstateException {
		return searchDao.search(criteria);
	}

	@Override
	public void addCity(City city) {
		cityDao.create(city);
		
	}

}
