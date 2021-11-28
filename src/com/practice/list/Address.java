package com.practice.list;

import jdk.jfr.DataAmount;


public class Address {
	
	private String streetName;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String streetName) {
		super();
		this.streetName = streetName;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + "]";
	}
	

}
