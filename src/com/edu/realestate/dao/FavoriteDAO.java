package com.edu.realestate.dao;

import com.edu.realestate.model.Favorite;

public interface FavoriteDAO extends AbstractDAO<Favorite> {
	
	void create(Favorite t);

	Favorite read(Integer id);

	void update(Favorite t);

	void delete(Integer id);

}
