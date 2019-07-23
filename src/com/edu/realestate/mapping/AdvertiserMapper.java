package com.edu.realestate.mapping;

import java.sql.ResultSet;

import com.edu.realestate.model.AdStatus;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.Advertiser;
import com.edu.realestate.model.RealEstate;
import com.edu.realestate.model.TransactionType;

public class AdvertiserMapper {
	
	public static Advertisement resultToAdv (ResultSet rs, Advertiser ad, RealEstate re) throws Exception {

	Advertisement adv = new Advertisement();
	adv.setId(rs.getInt("id"));
	adv.setTitle(rs.getString("title"));
	adv.setDescription(rs.getString("description"));
	adv.setAdvertiser(ad);
	adv.setRealEstate(re);
	adv.setAdNumber(rs.getString("ad_number"));
	
	AdStatus as = AdStatus.valueOf(rs.getString("status"));
	TransactionType tt = TransactionType.valueOf(rs.getString("transaction_type")); 
	
	
	adv.setStatus(as);
	adv.setTransactionType(tt);
	
//	adv.setReleaseDate(releaseDate);
	
	
	return adv; 
	}
}
