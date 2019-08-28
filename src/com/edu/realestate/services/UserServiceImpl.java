package com.edu.realestate.services;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.edu.realestate.dao.UserDAO;
import com.edu.realestate.dao.UserDaoHib;
import com.edu.realestate.exceptions.AuthenticationException;
import com.edu.realestate.model.Advertiser;
import com.edu.realestate.model.Moderator;
import com.edu.realestate.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	UserDAO userDao = new UserDaoHib();
	
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
	public void deleteAccount(User t) {
		userDao.delete(t);
		
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
