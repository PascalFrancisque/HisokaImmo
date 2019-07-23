package com.edu.realestate.services;

import java.util.List;

import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;
import com.edu.realestate.model.Picture;

public interface AdvertisementService {
	
	List<Advertisement> findAdvertisementByStatus(AdStatus status) throws RealEstateException;
	
	Advertisement findAdvertisementById(String id) throws RealEstateException;
	
	void placeAdvertisement(Advertisement ad) throws RealEstateException;
	
	List<Picture> findPicturesbybAdId(int aid) throws RealEstateException;
	
	List<Advertisement> findLatestAds() throws RealEstateException;
	
	List<Advertisement> findBestAds() throws RealEstateException;
	
	List<Advertisement> findAdvertisement(City city);
}
