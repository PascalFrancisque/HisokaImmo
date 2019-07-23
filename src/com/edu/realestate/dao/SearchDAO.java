package com.edu.realestate.dao;

import java.util.List;

import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.SearchCriteria;

public interface SearchDAO {
	
	public List<Advertisement> search(SearchCriteria criteria);

}
