package com.edu.realestate.dao;

import java.util.List;


import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;
import com.edu.realestate.model.Picture;


public interface AdvertisementDAO extends AbstractDAO<Advertisement> {

	public Advertisement read (Integer id);
	
	public void create (Advertisement ad);
	
	public void update(Advertisement ad);

	public void delete(Advertisement ad);
	
	public void refuseAd(Integer id, String refusedComment);
	
	public void validateAd(Integer adId);

	public List<Advertisement> latestAds(int nbAds);

	public List<Advertisement> bestAds();

	public List<Advertisement> readAllCity(City city);

	public List<Advertisement> readAllStatus(AdStatus status);

	public List<Advertisement> readFavAds(String owner);

	public List<Advertisement> readMyAds(String username);
	
	public Picture readOnePicbyId(Integer id); 

}