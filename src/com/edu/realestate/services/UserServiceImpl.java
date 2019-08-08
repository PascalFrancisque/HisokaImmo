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
		userDao.create(adv);
	}

	@Override
	public void register(Moderator mod) {
		userDao.create(mod);
	}
	
	@Override
	public void updateAccount(Advertiser adv) {
		userDao.update(adv);
	}

	@Override
	public void updateAccount(Moderator mod) {
		userDao.update(mod);
	}

	@Override
	public void deleteAccount(String username) {
		userDao.delete(username);
		
	}


	@Override
	public User authenticate(String login, String password) throws AuthenticationException {
		return userDao.authenticate(login, password);
	}

	@Override
	public void disconnect(User u) {
		userDao.disconnect(u);
	}

	
}
