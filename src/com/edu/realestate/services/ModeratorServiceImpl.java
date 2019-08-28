package com.edu.realestate.services;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.realestate.dao.AdvertisementDAO;
import com.edu.realestate.dao.AdvertisementDaoHib;
import com.edu.realestate.dao.UserDAO;
import com.edu.realestate.dao.UserDaoHib;
import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.Advertiser;
import com.edu.realestate.model.Moderator;
import com.edu.realestate.model.User;

@Service
@Transactional
public class ModeratorServiceImpl implements ModeratorService {

	AdvertisementDAO advertisementDAO = new AdvertisementDaoHib();
	UserDAO userDAO = new UserDaoHib(); 
	
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

	@Override
	public void updateAdvertisement(Advertisement ad) {
		advertisementDAO.update(ad);
		
	}
	

	@Override
	public void updateUser(Advertiser adv) {
		userDAO.update(adv);
		
	}

	@Override
	public void updateUser(Moderator mod) {
		userDAO.update(mod);
	}

	@Override
	public void deleteUser(User t) {
		userDAO.delete(t);
		
	}

	@Override
	public void deleteAdvertisement(Advertisement ad) throws RealEstateException {
		advertisementDAO.delete(ad);
		
	}

}
