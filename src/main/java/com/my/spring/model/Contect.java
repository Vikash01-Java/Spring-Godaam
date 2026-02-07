package com.my.spring.model;

public class Contect {
	private String city , state;

	public Contect() {
		super();
	}

	public Contect(String city, String state) {
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
		return "Contect [city=" + city + ", state=" + state + "]";
	}


}
