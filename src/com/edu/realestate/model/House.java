package com.edu.realestate.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import com.edu.realestate.convert.BooleanToStringConverter;

@Entity @PrimaryKeyJoinColumn(name="id")
public class House extends RealEstate {
	
	private Integer rooms;
	
	@Column(name = "land_area")
	private Integer landArea;
	
	@Column(name = "energy_level")
	private String energyLevel;
	
	@Column(name = "gas_level")
	private String gasLevel;
	
	@Convert(converter=BooleanToStringConverter.class)
	private boolean cellar;
	
	@Convert(converter=BooleanToStringConverter.class)
	private boolean alarm;
	
	@Convert(converter=BooleanToStringConverter.class)
	@Column(name="swimming_pool")
	private boolean swimmingPool;
	
	
	public int getRooms() {
		return rooms;
	}
	
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
	public int getLandArea() {
		return landArea;
	}
	
	public void setLandArea(int landArea) {
		this.landArea = landArea;
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
	
	public boolean isCellar() {
		return cellar;
	}
	
	public void setCellar(boolean cellar) {
		this.cellar = cellar;
	}
	
	public boolean isAlarm() {
		return alarm;
	}
	
	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
	}
	
	public boolean isSwimmingPool() {
		return swimmingPool;
	}
	
	public void setSwimmingPool(boolean swimmingPool) {
		this.swimmingPool = swimmingPool;
	}
	
	@Override
	public String toString() {
		return "House [rooms=" + rooms + ", landArea=" + landArea + ", energyLevel=" + energyLevel + ", gasLevel="
				+ gasLevel + ", cellar=" + cellar + ", alarm=" + alarm + ", swimmingPool=" + swimmingPool + super.toString() + "]";
	}

	

	
}
