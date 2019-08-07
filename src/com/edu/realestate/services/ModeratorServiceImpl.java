package com.edu.realestate.services;

import java.util.List;

import com.edu.realestate.dao.AdvertisementDAO;
import com.edu.realestate.dao.AdvertisementDaoJDBC;
import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;

public class ModeratorServiceImpl implements ModeratorService {

	AdvertisementDAO advertisementDAO = new AdvertisementDaoJDBC();
	
	@Override
	public void validateAdvertisement(Integer adId) {
		advertisementDAO.validateAd(adId); 
	}

	@Override
	public void refuseAdvertisement(Integer adId, String refusedComment) {
		advertisementDAO.refuseAd(adId, refusedComment);
	}

	@Override
	public List<Advertisement> findAdvertisementsByStatus(AdStatus status) throws RealEstateException {
		List<Advertisement> adsByStatus = advertisementDAO.readAllStatus(status);
		return adsByStatus;
	}

}
