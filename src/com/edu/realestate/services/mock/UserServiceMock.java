package com.edu.realestate.services.mock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.edu.realestate.exceptions.AuthenticationException;
import com.edu.realestate.model.Advertiser;
import com.edu.realestate.model.Moderator;
import com.edu.realestate.model.User;
import com.edu.realestate.services.UserService;

public class UserServiceMock implements UserService {
	
	private List<User> users; 
	
	public UserServiceMock() {
		users = new ArrayList<>();
	}

	@Override
	public void register(Advertiser adv) {
		users.add(adv);
		System.out.println("Advertisor enregistré");

	}

	@Override
	public void register(Moderator mod) {
		users.add(mod);
		System.out.println("Moderator enregistré");

	}

	@Override
	public User authenticate(String login, String password) throws AuthenticationException {
		
		Iterator<User> it = users.iterator();
		do {
			User u = it.next(); 
			if (u.getPassword().equals(password) && u.getUsername().equals(login)) {
				return u;
			}
		} while (it.hasNext());
		
		throw new AuthenticationException();
	}

	@Override
	public void disconnect(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccount(Advertiser adv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccount(Moderator mod) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAccount(User t) {
		// TODO Auto-generated method stub
		
	}

	
}
