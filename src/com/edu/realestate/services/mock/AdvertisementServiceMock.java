package com.edu.realestate.services.mock;

import java.util.ArrayList;
import java.util.List;

import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;
import com.edu.realestate.model.Picture;
import com.edu.realestate.services.AdvertisementService;

public class AdvertisementServiceMock implements AdvertisementService {

	@Override
	public List<Advertisement> findAdvertisement(City cty) {
		
	     List<Advertisement> ads = new ArrayList<>();
	        for (int i = 0 ; i< 10 ; i++) { 
	            Advertisement a = new Advertisement(); 
	            a.setId(i);
	            a.setTitle("AD"+i);
	            ads.add(a);
	        }
	        return ads;
	}

	@Override
	public List<Advertisement> findAdvertisementByStatus(AdStatus status) throws RealEstateException {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void placeAdvertisement(Advertisement ad) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Advertisement> findLatestAds(Integer nbAds) throws RealEstateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> findBestAds() throws RealEstateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Advertisement findAdvertisementById(Integer id) throws RealEstateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Picture> findPicturesbybAdId(Integer aid) throws RealEstateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAdvertisement(Advertisement ad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdvertisement(Advertisement ad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Advertisement> findFavAds(String owner) throws RealEstateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> findMyAds(String username) throws RealEstateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void favoriteAd(Integer aid) throws RealEstateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Picture findPicturebyId(Integer id) throws RealEstateException {
		// TODO Auto-generated method stub
		return null;
	}

}
