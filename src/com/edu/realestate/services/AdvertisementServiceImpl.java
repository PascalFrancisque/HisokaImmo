package com.edu.realestate.services;

import java.util.List;

import com.edu.realestate.dao.AdvertisementDAO;
import com.edu.realestate.dao.AdvertisementDaoJDBC;
import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;
import com.edu.realestate.model.Picture;

public class AdvertisementServiceImpl implements AdvertisementService {
	
	private AdvertisementDAO advertisementDAO = new AdvertisementDaoJDBC();
	
	@Override
	public void placeAdvertisement(Advertisement ad) {
	advertisementDAO.create(ad);
	}
	
	@Override
	public void updateAdvertisement(Advertisement ad) {
		advertisementDAO.update(ad);
	}

	@Override
	public void deleteAdvertisement(Integer aid) {
		advertisementDAO.delete(aid);
	}
	
	@Override
	public List<Advertisement> findAdvertisementByStatus(AdStatus status) throws RealEstateException {
	List<Advertisement> adsByStatus = advertisementDAO.readAllStatus(status);
	return adsByStatus;
	}

	@Override
	public Advertisement findAdvertisementById(Integer id) throws RealEstateException {
	Advertisement ad = advertisementDAO.read(id);
	return ad;
	}


	@Override
	public List<Picture> findPicturesbybAdId(Integer aid) throws RealEstateException {
	List<Picture> pictures = advertisementDAO.read(aid).getPictures();
		return pictures;
	}

	@Override
	public List<Advertisement> findLatestAds() throws RealEstateException {
	List<Advertisement> latestAds = advertisementDAO.latestAds();
		return latestAds;
	}

	@Override
	public List<Advertisement> findBestAds() throws RealEstateException {
		List<Advertisement> bestAds = advertisementDAO.bestAds();
		return bestAds;
	}

	@Override
	public List<Advertisement> findAdvertisement(City city) {
		List<Advertisement> ads = advertisementDAO.readAllCity(city);
		return ads;
	}

	@Override
	public List<Advertisement> findFavAds(String owner) throws RealEstateException {
		List<Advertisement> favAds = advertisementDAO.readFavAds(owner); 
		return favAds;
	}

	@Override
	public List<Advertisement> findMyAds(String username) throws RealEstateException {
		List<Advertisement> myAds = advertisementDAO.readMyAds(username); 
		return myAds;
	}

	@Override
	public void favoriteAd(Integer aid) throws RealEstateException {
		// TODO Auto-generated method stub
	}


}
