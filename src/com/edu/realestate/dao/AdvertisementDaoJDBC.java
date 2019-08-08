package com.edu.realestate.dao;

import java.util.List;

import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;


public class AdvertisementDaoJDBC extends AbstractDaoJDBC implements AdvertisementDAO {

	@Override
	public void create(Advertisement t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Advertisement t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void refuseAd(Integer id, String refusedComment) {
		// TODO Auto-generated method stub
	}

	@Override
	public void validateAd(Integer adId) {
		// TODO Auto-generated method stub
	}


	@Override
	public Advertisement read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public List<Advertisement> latestAds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> bestAds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> readAllCity(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> readAllStatus(AdStatus status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> readFavAds(String owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> readMyAds(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
