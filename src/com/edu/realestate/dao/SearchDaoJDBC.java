package com.edu.realestate.dao;

import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.edu.realestate.mapping.AdvertiserMapper;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.Advertiser;
import com.edu.realestate.model.RealEstate;
import com.edu.realestate.model.SearchCriteria;

public class SearchDaoJDBC extends AbstractDaoJDBC implements SearchDAO {


	private UserDAO udao; 
	//private RealEstateDAO rdao; 
	
	
	public SearchDaoJDBC() {
		udao = new UserDaoJDBC();
//		rdao = new RealEstateDaoJDBC();
	}
	
	
	
	@Override
	public List<Advertisement> search(SearchCriteria criteria) {
		
		Integer id = criteria.getCityId(); 
		List<Advertisement> advs = new ArrayList<>();
		String query = "SELECT * from advertisement as a JOIN real_estate as r " + "on (a.real_estate_id = r.id)" 
						+ " WHERE r.city_id ="+ id + " and status ='Validated'";
	
		try {
			Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			
			while (rs.next()){
					String aid = rs.getString("advertiser_id");
					Advertiser ad = (Advertiser)udao.read(aid);
					System.out.println(udao.read(aid));
					//Integer rid = rs.getInt("real_estate_id");
					RealEstate re = null; //rdao.read(rid);
				
					
					//MAP
					Advertisement adv = AdvertiserMapper.resultToAdv(rs, ad, re);
					advs.add(adv);
					}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		return advs;
	}
	
	//ECRITURE OO VERS DB
	public static Statement advToStatement(Advertisement adv) throws Exception {
		return null;}
}
