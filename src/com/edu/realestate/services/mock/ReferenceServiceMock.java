package com.edu.realestate.services.mock;

import java.util.ArrayList;
import java.util.List;

import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;
import com.edu.realestate.model.SearchCriteria;
import com.edu.realestate.services.ReferenceService;

public class ReferenceServiceMock implements ReferenceService {
	
	
	@Override
    public List<City> listCities() {
        
        List<City> cities = new ArrayList<>();
        for (int i = 0 ; i< 10 ; i++) { 
            // TODO Auto-generated method stub
            City c = new City(i,"Rennes "+i,35000+i);           
            cities.add(c);
        }
        return cities;
    }

	@Override
	public List<City> findCitiesByName(String input) throws RealEstateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> findAdsByCriteria(SearchCriteria criteria) throws RealEstateException {
		// TODO Auto-generated method stub
		return null;
	}
}
