package com.edu.realestate.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;
import com.edu.realestate.model.Picture;

@Repository
public class AdvertisementDaoHib extends AbstractDaoHib implements AdvertisementDAO {

	@Autowired
	AdvertisementDAO advertisementDao;
	
	
	@Override
	public void create(Advertisement ad) {
		Session session = getSession();
		session.save(ad);
	}

	@Override
	public Advertisement read(Integer id) {
		Session session = getSession();
		Advertisement ad = session.get(Advertisement.class, id);
		return ad;
	}

	@Override
	public void update(Advertisement ad) {
		Session session = getSession();
		session.update(ad);
	}

	@Override
	public void delete(Advertisement ad) {
		Session session = getSession();
		session.remove(ad);
	}

	@Override
	public void refuseAd(Integer id, String refusedComment) {
	
	}

	@Override
	public void validateAd(Integer adId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Advertisement> latestAds(int nbAds) {
		Session session = getSession();
		String hql = "select a from Advertisement a " 
		+ "where a.status = :status order by a.releaseDate desc";
		
		Query<Advertisement> query = session.createQuery(hql, Advertisement.class);
		query.setParameter("status", AdStatus.Validated);
		
		List<Advertisement> ads = query.setMaxResults(nbAds).getResultList();
		return ads;
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
		Session session = getSession();
		String hql = "select a from Advertisement a where a.status = :status"; 
	
		Query<Advertisement> query = session.createQuery(hql, Advertisement.class);
		query.setParameter("status", status);
		
		List<Advertisement> ads = query.getResultList();
		return ads;
		
	}

	@Override
	public List<Advertisement> readFavAds(String owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> readMyAds(String username) {
		Session session = getSession();
		String hql = "select a from Advertisement a where a.advertiser = "+ username 
				+ " where a.status = :status ";
				
		Query<Advertisement> query = session.createQuery(hql, Advertisement.class);
		query.setParameter("status", "Validated");
		
		List<Advertisement> ads = query.getResultList();
		return ads;
		
	}

	@Override
	public Picture readOnePicbyId(Integer id) {
		Session session = getSession();
		String hql = "select p from Picture p where p.id = "+ id;
		Query<Picture> query = session.createQuery(hql, Picture.class);
		
		Picture pic = query.getSingleResult();
		return pic;
	}

}
