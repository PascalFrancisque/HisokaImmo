package com.edu.realestate.mapping;

import java.sql.ResultSet;
import java.sql.Statement;

import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.Advertiser;
import com.edu.realestate.model.Moderator;
import com.edu.realestate.model.User;

public class UserMapper {
	
	// D'UN RESULTAT VERS USER
	public static User resultToUser(ResultSet rs) throws Exception {
		User reponse = null;
		String ut = rs.getString("user_type");
		switch (ut) {
		case "M" : reponse = new Moderator(); break;
		default : reponse = new Advertiser(); break;
	}
	reponse.setUsername(rs.getString("username"));
	reponse.setPassword(rs.getString("password"));
	return reponse;
}
	
	// D'UN USER VERS "INSERT / UPDATE"
	public static Statement userToStatement(User user) throws Exception {
		throw new RealEstateException();
	}

}
