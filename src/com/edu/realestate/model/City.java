package com.edu.realestate.model;

public class City implements Comparable {
	
	private int id;
	private String name; 
	private int postCode;
	private double longitude;
	private double latitude;
	
	
	
	public City() {
		super();
	}

	public City(int id, String name, int postCode) {
		super();
		this.id = id;
		this.name = name;
		this.postCode = postCode;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", postCode=" + postCode + ", longitude=" + longitude
				+ ", latitude=" + latitude + "]";
	}

	@Override
	public int compareTo(Object obj) {
		if (this == obj)
			return 0;
		if (obj == null)
			return 1;
		if (!(obj instanceof City))
			return 0;
		City other = (City) obj;
		//return id - other.id;
		//return name.compareTo(other.name);
		//return 1* name.compareTo(other.name);
		int r = id - other.id;
		if (r!=0) return r; 
		return name.compareTo(other.name);
	}
	
	

}
