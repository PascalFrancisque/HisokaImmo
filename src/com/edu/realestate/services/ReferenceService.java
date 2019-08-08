package com.edu.realestate.services;

import java.util.List;

import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;
import com.edu.realestate.model.SearchCriteria;

public interface ReferenceService {
	
	List<City> listCities();
	
	List<City> findCitiesByName(String city) throws RealEstateException;
	
	List<Advertisement> findAdsByCriteria(SearchCriteria criteria) throws RealEstateException;
	
	void addCity(City city);

}
