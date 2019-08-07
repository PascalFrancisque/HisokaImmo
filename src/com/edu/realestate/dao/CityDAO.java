package com.edu.realestate.dao;

import java.util.List;

import com.edu.realestate.model.City;

public interface CityDAO extends AbstractDAO<City> {
	
	List<City> listAll();
	
	List<City> findCitiesByName(String name);
}
