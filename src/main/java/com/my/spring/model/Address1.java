package com.my.spring.model;

public class Address1 {
	private String city , state;

	public Address1() { 
		super();
	}

	public Address1(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address1 [city=" + city + ", state=" + state + "]";
	}
	
	

}
