package com.edu.realestate.model;

import java.io.Serializable;

public class SearchCriteria implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int cityId;
	private String query; /// where description like %query% or title like %query%
	private String type;  // TransactionType
	private int priceMin; // A exclure si 0 ou aberrant  
	private int priceMax; // A exclure si 0 ou aberrant  
	private int areaMin;  // A exclure si 0 ou aberrant  
	private int areaMax;  // A exclure si 0 ou aberrant  
	private double longitude;
	private double latitude;
	private int distance;
	
	
	@Override
	public String toString() {
		return "SearchCriteria [cityId=" + cityId + ", query=" + query + ", type=" + type + ", priceMin=" + priceMin
				+ ", priceMax=" + priceMax + ", areaMin=" + areaMin + ", areaMax=" + areaMax + "]";
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPriceMin() {
		return priceMin;
	}
	public void setPriceMin(int priceMin) {
		this.priceMin = priceMin;
	}
	public int getPriceMax() {
		return priceMax;
	}
	public void setPriceMax(int priceMax) {
		this.priceMax = priceMax;
	}
	public int getAreaMin() {
		return areaMin;
	}
	public void setAreaMin(int areaMin) {
		this.areaMin = areaMin;
	}
	public int getAreaMax() {
		return areaMax;
	}
	public void setAreaMax(int areaMax) {
		this.areaMax = areaMax;
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
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
}
