package com.edu.realestate.services;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.realestate.dao.CityDAO;
import com.edu.realestate.dao.CityDaoHib;
import com.edu.realestate.dao.SearchDAO;
import com.edu.realestate.dao.SearchDaoHib;
import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;
import com.edu.realestate.model.SearchCriteria;

@Service
@Transactional
public class ReferenceServiceImpl implements ReferenceService {

	SearchDAO searchDao = new SearchDaoHib();
	CityDAO cityDao = new CityDaoHib();
	
	
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
