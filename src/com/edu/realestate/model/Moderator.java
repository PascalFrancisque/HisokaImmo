package com.edu.realestate.model;

public class Moderator extends User {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Moderator [" + super.toString() +"]";
	}

}
