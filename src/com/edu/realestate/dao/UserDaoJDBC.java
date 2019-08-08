package com.edu.realestate.dao;

import java.sql.ResultSet;


import java.sql.Statement;

import com.edu.realestate.exceptions.AuthenticationException;
import com.edu.realestate.mapping.UserMapper;
import com.edu.realestate.model.User;

public class UserDaoJDBC extends AbstractDaoJDBC implements UserDAO {

	@Override
	public void create(User t) {
		// TODO Auto-generated method stub
	}

	@Override
	public User read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User read(String username) {
		
		User reponse = null;

		try {
			Statement st = getConnection().createStatement();
			String sql = "SELECT * from user_data WHERE username ='"+ username +"'";
			ResultSet rs = st.executeQuery(sql);

			if (rs.next()) {
				reponse = UserMapper.resultToUser(rs); 
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return reponse;
	}

	
	@Override
	public User authenticate(String username, String password) throws AuthenticationException {
		
		User reponse = null; 
		try {
			String sql =
					"SELECT * from user_data where username = '" + username + "' AND password = '" + password + "'"; 
			Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			if (!rs.next()) throw new AuthenticationException();
			reponse = UserMapper.resultToUser(rs); 
			
		}catch (Exception e) {
			throw new AuthenticationException(" Problème de connection");
		}
		return reponse;

		}

	@Override
	public void disconnect(User u) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub
		
	}
	
	}
	
