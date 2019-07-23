package com.edu.model;

import com.edu.realestate.model.AdStatus;

public class TestStatus {

	public static void main(String[] args) {
		AdStatus status = AdStatus.Pending;
		status = AdStatus.Validated;
		
		status = AdStatus.valueOf("Pending");
		System.out.println(status.ordinal());

	}

}
