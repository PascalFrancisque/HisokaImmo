package com.edu.realestate.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.RealEstate;

@Repository
public class RealEstateDaoHib extends AbstractDaoHib implements RealEstateDAO {

	@Autowired
	RealEstateDAO realEstateDao;
	
	
	@Override
	public void create(RealEstate re) {
		Session session = getSession();
		session.save(re);

	}

	@Override
	public void update(RealEstate re) {
		Session session = getSession();
		session.update(re);
	}

	@Override
	public void delete(RealEstate re) {
		Session session = getSession();
		session.delete(re);

	}

	@Override
	public RealEstate read(Integer id) {
		Session session = getSession();
		RealEstate re = session.get(RealEstate.class, id);
		return re;
	}

}
