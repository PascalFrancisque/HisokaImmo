package com.edu.realestate.dao;

import java.util.List;
//import org.elasticsearch.index.query.QueryBuilders;

import com.edu.realestate.model.City;

public class CityDaoES implements CityDAO {

	
	EsClientProvider clientProvider;
	
	CityDaoES() {
		clientProvider = new EsClientProvider();
		//QueryBuilders.
	}
	
	@Override
	public void create(City t) {
		clientProvider.getClient();
	}

	@Override
	public City read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(City t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(City t) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<City> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> findCitiesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
