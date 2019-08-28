package com.edu.realestate.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table (name= "commercial_property")
@PrimaryKeyJoinColumn(name="id")
public class CommercialProperty extends RealEstate {
	
	
	public CommercialProperty() {}

	
	@Override
	public String toString() {
		return "CommercialProperty" + super.toString();
	}

	

}
