package com.edu.realestate.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edu.realestate.model.City;
import java.sql.Statement;

public class CityDaoJDBC extends AbstractDaoJDBC implements CityDAO {

	@Override
	public void create(City city) {
		// TODO Auto-generated method stub

	}

	@Override
	public City read(Integer id) {

		City city = null;

		try {
			Statement st = getConnection().createStatement();
			String sql = "SELECT * from City WHERE ID =" + id;
			ResultSet rs = st.executeQuery(sql);

			if (rs.next()) {
				city = new City();
				city.setId(rs.getInt("id"));
				city.setName(rs.getString("name"));
				city.setPostCode(rs.getInt("postcode"));
				city.setLongitude(rs.getDouble("longitude"));
				city.setLatitude(rs.getDouble("latitude"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return city;
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<City> listAll() {
		
		List<City> cities = new ArrayList<City>();

		try {
			Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * from City order by name");
			while (rs.next()){
					City city = new City();
					city.setId(rs.getInt("id"));
					city.setName(rs.getString("name"));
					city.setPostCode(rs.getInt("postcode"));
					city.setLongitude(rs.getDouble("longitude"));
					city.setLatitude(rs.getDouble("latitude"));
					cities.add(city);
					}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cities;
	}

	@Override
	public List<City> findCitiesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
