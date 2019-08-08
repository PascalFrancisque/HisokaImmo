package com.edu.realestate.dao;

import java.util.List;

import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;


public interface AdvertisementDAO extends AbstractDAO<Advertisement> {

	public Advertisement read (Integer id);
	
	public void create (Advertisement ad);
	
	public void update(Advertisement ad);

	public void delete(Integer id);
	
	public void refuseAd(Integer id, String refusedComment);
	
	public void validateAd(Integer adId);

	public List<Advertisement> latestAds();

	public List<Advertisement> bestAds();

	public List<Advertisement> readAllCity(City city);

	public List<Advertisement> readAllStatus(AdStatus status);

	public List<Advertisement> readFavAds(String owner);

	public List<Advertisement> readMyAds(String username);

}