package com.edu.realestate.model;

public abstract class RealEstate {
	
	//ATTRIBUTS
	protected int id;
	protected int price;
	protected short area;
	protected boolean available;
	protected City city;

	//CONSTRUCTEURS
	public RealEstate() {}
	
	public RealEstate(int id) {
		this.id = id;
	}
	
	public RealEstate(int id, int price, short area, boolean available, City city) {
		this.id = id;
		this.price = price;
		this.area = area;
		this.available = available;
		this.city = city;
	}
	

	// GETTERS & SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public short getArea() {
		return area;
	}
	public void setArea(short area) {
		this.area = area;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	} 
	
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
	
	
	@Override
	public String toString() {
		return "[id=" + id + ", price=" + price + ", area=" + area + ", available=" + available + ", city="
				+ city + "]";
	}
	
	
	

}
