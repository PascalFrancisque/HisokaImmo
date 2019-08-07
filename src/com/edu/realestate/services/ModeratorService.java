package com.edu.realestate.services;

import java.util.List;

import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;

public interface ModeratorService {

	void validateAdvertisement(Integer adId);
	
	void refuseAdvertisement(Integer adId, String refusedComment);

	List<Advertisement> findAdvertisementsByStatus(AdStatus status) throws RealEstateException;
}
