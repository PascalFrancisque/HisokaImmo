package com.edu.realestate.services;

import java.util.List;

import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;
import com.edu.realestate.model.Picture;

public interface AdvertisementService {
	
	List<Advertisement> findAdvertisementByStatus(AdStatus status) throws RealEstateException;
	
	Advertisement findAdvertisementById(Integer id) throws RealEstateException;
	
	void placeAdvertisement(Advertisement ad);
	
	void updateAdvertisement(Advertisement ad);
	
	void deleteAdvertisement(Advertisement ad);
	
	List<Picture> findPicturesbybAdId(Integer aid) throws RealEstateException;
	
	Picture findPicturebyId(Integer id) throws RealEstateException;
	
	List<Advertisement> findLatestAds(Integer nbAds) throws RealEstateException;
	
	List<Advertisement> findBestAds() throws RealEstateException;
	
	List<Advertisement> findAdvertisement(City city) throws RealEstateException;
	
	List<Advertisement> findFavAds(String owner) throws RealEstateException;
	
	List<Advertisement> findMyAds (String username) throws RealEstateException;
	
	void favoriteAd (Integer aid) throws RealEstateException;
	
	
}
