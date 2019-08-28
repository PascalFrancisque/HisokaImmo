package com.edu.jdbc;

import java.util.List;


import com.edu.realestate.dao.CityDAO;
import com.edu.realestate.dao.CityDaoJDBC;
import com.edu.realestate.dao.SearchDAO;
import com.edu.realestate.dao.SearchDaoJDBC;
import com.edu.realestate.dao.UserDAO;
import com.edu.realestate.dao.UserDaoJDBC;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.City;
import com.edu.realestate.model.SearchCriteria;
import com.edu.realestate.model.User;

public class TestJDBC {

	public static void main(String[] args) throws Exception {

		/*
		 * Date d = new Date(); System.out.println(d);
		 * 
		 * Class clz = Class.forName("java.util.Date"); Object o = clz.newInstance();
		 * System.out.println(o);
		 */

		CityDAO cdao = new CityDaoJDBC();
		List<City> cities = cdao.listAll();
		System.out.println(cities);
		
		UserDAO udao = new UserDaoJDBC();
		User u = udao.read("pascalFR");
		System.out.println(u);
		
		SearchCriteria criteria = new SearchCriteria();
		criteria.setCityId(30480);
		SearchDAO sdao = new SearchDaoJDBC();
		List<Advertisement> advs = sdao.search(criteria);
		for (Advertisement a : advs)
		System.out.println(a); 
	
	try {
		User usr = udao.authenticate("pascalFr", "pascal");
		System.out.println(usr);
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}
}
