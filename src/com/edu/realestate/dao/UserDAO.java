package com.edu.realestate.dao;

import com.edu.realestate.exceptions.AuthenticationException;
import com.edu.realestate.model.User;

public interface UserDAO extends AbstractDAO<User> {
	
	User read (String username);
	
	User authenticate(String username, String password)
			throws AuthenticationException; 
	
	void create(User t);

	void disconnect(User u);
}
