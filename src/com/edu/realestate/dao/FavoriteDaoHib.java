package com.edu.realestate.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.edu.realestate.model.Favorite;

@Repository
public class FavoriteDaoHib extends AbstractDaoHib implements FavoriteDAO {

	@Autowired
	FavoriteDAO favoriteDao;

	@Override
	public void create(Favorite fav) {
		Session session = getSession();
		session.save(fav);
	}

	@Override
	public Favorite read(Integer id) {
		Session session = getSession();
		Favorite fav = session.load(Favorite.class, id);
		return fav;
	}

	@Override
	public void update(Favorite fav) {
		Session session = getSession();
		session.update(fav);
	}

	@Override
	public void delete(Favorite fav) {
		Session session = getSession();
		session.delete(fav);
	}

}
