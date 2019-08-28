package com.edu.realestate.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import com.edu.realestate.convert.BooleanToStringConverter;

@Entity @PrimaryKeyJoinColumn(name="id")
public class Apartment extends RealEstate {
	
	
	private Integer rooms;
	private String floor;
	
	@Column(name = "energy_level")
	private String energyLevel;
	
	@Column(name = "gas_level")
	private String gasLevel;
	
	@Convert(converter=BooleanToStringConverter.class)
	private boolean elevator;
	
	@Convert(converter=BooleanToStringConverter.class)
	private boolean intercom;
	
	@Convert(converter=BooleanToStringConverter.class)
	private boolean balcony;
	
	@Convert(converter=BooleanToStringConverter.class)
	private boolean terrace;
	
	@Convert(converter=BooleanToStringConverter.class)
	private boolean garage;
	
	@Convert(converter=BooleanToStringConverter.class)
	private boolean parking;
	
	@Convert(converter=BooleanToStringConverter.class)
	private boolean alarm;
	
	@Convert(converter=BooleanToStringConverter.class)
	private boolean digicode;


	public Apartment() {
		super();
	}

	public Apartment(int rooms) {
		this.rooms = rooms;
	}

	public Apartment(int rooms, String floor, String energyLevel, String gasLevel, boolean elevator,
			boolean intercom, boolean balcony, boolean terrace, boolean garage, boolean parking, boolean alarm,
			boolean digicode) {
		super();
		this.rooms = rooms;
		this.floor = floor;
		this.energyLevel = energyLevel;
		this.gasLevel = gasLevel;
		this.elevator = elevator;
		this.intercom = intercom;
		this.balcony = balcony;
		this.terrace = terrace;
		this.garage = garage;
		this.parking = parking;
		this.alarm = alarm;
		this.digicode = digicode;
	}


	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(String energyLevel) {
		this.energyLevel = energyLevel;
	}

	public String getGasLevel() {
		return gasLevel;
	}

	public void setGasLevel(String gasLevel) {
		this.gasLevel = gasLevel;
	}

	public boolean isElevator() {
		return elevator;
	}

	public void setElevator(boolean elevator) {
		this.elevator = elevator;
	}

	public boolean isIntercom() {
		return intercom;
	}

	public void setIntercom(boolean intercom) {
		this.intercom = intercom;
	}

	public boolean isBalcony() {
		return balcony;
	}

	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}

	public boolean isTerrace() {
		return terrace;
	}

	public void setTerrace(boolean terrace) {
		this.terrace = terrace;
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isAlarm() {
		return alarm;
	}

	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
	}

	public boolean isDigicode() {
		return digicode;
	}

	public void setDigicode(boolean digicode) {
		this.digicode = digicode;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + rooms;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Apartment) {
			Apartment a2 = (Apartment)obj;
			return id == a2.getId();
		}
		return false;
	}


	@Override
	public String toString() {
		return "Apartment [" + super.toString() + ", rooms=" + rooms + ", floor=" + floor + ", energyLevel=" + energyLevel
				+ ", gasLevel=" + gasLevel + ", elevator=" + elevator + ", intercom=" + intercom + ", balcony="
				+ balcony + ", terrace=" + terrace + ", garage=" + garage + ", parking=" + parking + ", alarm=" + alarm
				+ ", digicode=" + digicode + "]";
	}
	
	

}
