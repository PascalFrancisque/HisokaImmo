package com.edu.realestate.mapping;

import java.sql.ResultSet;

import com.edu.realestate.model.Apartment;
import com.edu.realestate.model.CommercialProperty;
import com.edu.realestate.model.House;
import com.edu.realestate.model.Land;
import com.edu.realestate.model.OtherProperty;
import com.edu.realestate.model.Parking;
import com.edu.realestate.model.RealEstate;

public class RealEstateMapper {
	
	public static String tableFromType(String type) {
		switch(type)
		{
		case "APP": return "apartement";
		case "HOUSE" : return "house"; 
		case "PRK" : return "parking";
		case "LAND" : return "land";
		case "COMM" : return "commercial_property";
		//default : return "other_property";
		}
	  return null;
	}
	
	
	public static RealEstate resulToRealEstate(ResultSet rs, String type) throws Exception {
		RealEstate re = null;
		switch (type)
		{
		case "APP": 
			Apartment a = new Apartment();
			 a.setRooms(rs.getInt("rooms"));
             a.setFloor(rs.getString("floor"));
             a.setEnergyLevel(rs.getString("energy_level"));
             a.setGasLevel(rs.getString("gas_level"));
             a.setElevator(rs.getString("elevator").equalsIgnoreCase("Y"));
             a.setIntercom(rs.getString("intercom").equalsIgnoreCase("Y"));
             a.setBalcony(rs.getString("balcony").equalsIgnoreCase("Y"));
             a.setTerrace(rs.getString("terrace").equalsIgnoreCase("Y"));
             a.setGarage(rs.getString("garage").equalsIgnoreCase("Y"));
             a.setParking(rs.getString("parking").equalsIgnoreCase("Y"));
             a.setAlarm(rs.getString("alarm").equalsIgnoreCase("Y"));
             a.setDigicode(rs.getString("digicode").equalsIgnoreCase("Y"));
			re = a;
			break;
			
		case "HOUSE" : 
			House h = new House(); 
			 h.setRooms(rs.getInt("rooms"));
             h.setLandArea(rs.getInt("land_area"));
             h.setEnergyLevel(rs.getString("energy_level"));
             h.setGasLevel(rs.getString("gas_level"));
             h.setCellar(rs.getString("cellar").equalsIgnoreCase("Y"));
             h.setAlarm(rs.getString("alarm").equalsIgnoreCase("Y"));
             h.setSwimmingPool(rs.getString("swimming_pool").equalsIgnoreCase("Y"));
			re = h;
			break;
			
		case "PRK" : 
			Parking p = new Parking(); 
			re = p; 
			break;
			
		case "LAND" :
			Land l = new Land();
			re = l; 
			break;
			
		case "COMM" :
			CommercialProperty cp = new CommercialProperty();
			re = cp;
			break; 
			
			default : 
			OtherProperty op = new OtherProperty(); 
			re = op; 
			break;
		}
		
		re.setPrice(rs.getInt("price"));
        re.setArea(rs.getShort("area"));
        re.setAvailable(rs.getBoolean("available"));
		return re;
	}
}


