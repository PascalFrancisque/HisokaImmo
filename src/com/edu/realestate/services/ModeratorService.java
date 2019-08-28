package com.edu.realestate.services;

import java.util.List;

import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.Advertiser;
import com.edu.realestate.model.Moderator;
import com.edu.realestate.model.User;

public interface ModeratorService {

	void validateAdvertisement(Integer adId) throws RealEstateException;
	
	void updateAdvertisement(Advertisement ad) throws RealEstateException;
	
	void deleteAdvertisement(Advertisement ad) throws RealEstateException;
	
	void refuseAdvertisement(Integer adId, String refusedComment) throws RealEstateException;
	
	void updateUser (Advertiser adv) throws RealEstateException;

	void updateUser (Moderator mod) throws RealEstateException;
	
	void deleteUser (User t) throws RealEstateException;

	List<Advertisement> findAdvertisementsByStatus(AdStatus status) throws RealEstateException;
}
