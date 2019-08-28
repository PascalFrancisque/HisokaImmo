package com.edu.realestate.services;

import com.edu.realestate.exceptions.AuthenticationException;
import com.edu.realestate.model.Advertiser;
import com.edu.realestate.model.Moderator;
import com.edu.realestate.model.User;


public interface UserService {
	
	void register (Advertiser adv);
	
	void register (Moderator mod); 
	
	void updateAccount (Advertiser adv); 
	
	void updateAccount (Moderator mod); 
	
	void deleteAccount (User t);
	
	User authenticate(String login, String password) throws AuthenticationException ;
	
	void disconnect(User t);

}
