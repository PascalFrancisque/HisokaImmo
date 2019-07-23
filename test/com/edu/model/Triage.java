package com.edu.model;

import java.util.List;

import com.edu.realestate.model.City;

import java.util.ArrayList;

public class Triage {

	public static void main(String[] args) {
		
		City c1 = new City(1, "Paris", 75000);
		City c2 = new City(5, "Marseille", 13000);
		City c3 = new City(8, "Lille", 59000);
		City c4 = new City(13,"Nantes", 44000);
		City c5 = new City(1, "Bordeaux", 33000);
		
		List<City> cities = new ArrayList<City>();
		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
		cities.add(c4);
		cities.add(c5);
		
		CityComparator cc = new CityComparator();
		
		cities.sort(cc);
		
		for (Object cty : cities)
			System.out.println(cty);
	

	}

}
