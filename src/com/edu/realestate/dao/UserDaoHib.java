package com.edu.realestate.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.edu.realestate.exceptions.AuthenticationException;
import com.edu.realestate.model.User;

@Repository
public class UserDaoHib extends AbstractDaoHib implements UserDAO {

@Autowired
UserDAO userDao;
	
	@Override
	public User read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User u) {
		Session session = getSession();
		session.update(u);
	}


	@Override
	public User read(String username) {
		Session session = getSession();
		User u = session.load(User.class, username);
		return u;
	}

	@Override
	public User authenticate(String username, String password) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(User u) {
		Session session = getSession();
		session.save(u);
	}

	@Override
	public void disconnect(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User t) {
		getSession().remove(t);
	}

}
