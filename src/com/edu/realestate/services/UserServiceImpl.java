package com.edu.realestate.services;

import com.edu.realestate.dao.UserDAO;
import com.edu.realestate.exceptions.AuthenticationException;
import com.edu.realestate.model.Advertiser;
import com.edu.realestate.model.Moderator;
import com.edu.realestate.model.User;


public class UserServiceImpl implements UserService {
	
	UserDAO userDao;

	@Override
	public void register(Advertiser adv) {
		// TODO Auto-generated method stub

	}

	@Override
	public void register(Moderator mod) {
		// TODO Auto-generated method stub

	}

	@Override
	public User authenticate(String login, String password) throws AuthenticationException {
		return userDao.authenticate(login, password);
	}

	@Override
	public void disconnect(User u) {
		// TODO Auto-generated method stub

	}

}
