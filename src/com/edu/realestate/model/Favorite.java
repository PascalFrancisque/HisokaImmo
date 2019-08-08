package com.edu.realestate.model;

public class Favorite {
	
	Integer id;
	String owner;
	Integer advertisement_id;
	Integer priority;
	String comments;
	
	public Favorite() {
		super();
	}

	public Favorite(Integer id, String owner, Integer advertisement_id, Integer priority, String comments) {
		super();
		this.id = id;
		this.owner = owner;
		this.advertisement_id = advertisement_id;
		this.priority = priority;
		this.comments = comments;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Integer getAdvertisement_id() {
		return advertisement_id;
	}

	public void setAdvertisement_id(Integer advertisement_id) {
		this.advertisement_id = advertisement_id;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Favorite [id=" + id + ", owner=" + owner + ", advertisement_id=" + advertisement_id + ", priority="
				+ priority + ", comments=" + comments + "]";
	} 
	
	
	
	
	
	
	
	
}
