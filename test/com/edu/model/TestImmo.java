package com.edu.model;

//import com.edu.realestate.model.City;

import com.edu.realestate.model.House;
import com.edu.realestate.model.Land;
import com.edu.realestate.model.Parking;
import com.edu.realestate.model.RealEstate;

public class TestImmo {

	public static void main(String[] args) {
		//City c1 = new City(0, null, 0);
		House h1 = new House();
		Land l1 = new Land();
		Parking p = new Parking();
		
		House nh = new House();
		//Object o = new House();
		RealEstate rr = new House();
		House h01 = new House();
		House h02 = new House();
		
		RealEstate []estates = {h01, p, l1, h1, h02, nh, rr};
		afficheTout(estates);
	}
	
	public static void afficheTout(RealEstate[] tab) {
		for (int i = 0; i < tab.length; i++)
			System.out.println(tab[i]);
	}

}
