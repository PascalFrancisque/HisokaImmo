package com.edu.realestate.services;

import java.util.Random;

import com.edu.realestate.model.*;


public class RealEstateFactory {
	
	private static int serialNumber = 10000;

	
	public RealEstate getRealEstate(RealEstateType type) {
		return this.getRealEstate(type, null);
	}
	
	public RealEstate getRealEstate(RealEstateType type, City city) {
		RealEstate realEstate = null; 

		switch (type) {
		case House : 
			House h = new House();
			h.setAlarm(true);
			h.setRooms(10);
			h.setPrice(2000000);
			realEstate = h;
			break;
		case Apartment : 
			Apartment a = new Apartment(20);
			a.setArea((short)500);
			a.setDigicode(true);
			a.setPrice(1000000);
			realEstate = a;
			break;
		case Parking : 
			Parking p = new Parking();
			p.setArea((short)10);
			p.setPrice(10000);
			realEstate = p;
			break;
		case Land : 
		case Commercial:
		case Other : 
		default :
			System.out.println("Problème de paramètre");
		}
		
		if (realEstate!=null) {
//			Random r = new Random();
//			int fakeId = r.nextInt(100000);
			realEstate.setId(serialNumber++);
			realEstate.setCity(city);
		}
		return realEstate;
	}

}
