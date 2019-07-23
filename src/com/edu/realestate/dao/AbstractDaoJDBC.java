package com.edu.realestate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbstractDaoJDBC {

	private static Connection connection;
	
	Connection getConnection() {
		
		if(connection == null) {
			String connectParam = "?serverTimezone=UTC";
			String connectURL = "jdbc:mysql://localhost:3307/realEstate" + connectParam;
			String user = "root";
			String password = "";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(connectURL, user, password);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
		}
		return connection;
	}
	
	
	void disconnect() {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
