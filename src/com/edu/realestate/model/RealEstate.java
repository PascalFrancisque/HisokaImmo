package com.edu.realestate.model;

import javax.persistence.Convert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.edu.realestate.convert.BooleanToStringConverter;

//import org.hibernate.annotations.Type;

@Entity @Table(name = "real_estate")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class RealEstate {
	
	//ATTRIBUTS
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	protected Integer price;
	protected Short area;
	
	@Convert(converter=BooleanToStringConverter.class)
	protected boolean available;

	// where r.city_id = c.id 
	@ManyToOne @JoinColumn(name = "city_id")
	protected City city;

	//CONSTRUCTEURS
	public RealEstate() {}
	
	public RealEstate(Integer id) {
		this.id = id;
	}
	
	public RealEstate(Integer id, Integer price, Short area, boolean available, City city) {
		this.id = id;
		this.price = price;
		this.area = area;
		this.available = available;
		this.city = city;
	}
	

	// GETTERS & SETTERS
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Short getArea() {
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
