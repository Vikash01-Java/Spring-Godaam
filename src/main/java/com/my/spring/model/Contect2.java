package com.my.spring.model;
//Auto wire
//by default singleton
//scope="prototype"
//scope="singleton"by default
//inner Bean
public class Contect2 {
	private String city , state;

	public Contect2() {
		super();
	}

	public Contect2(String city, String state) {
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
		return "Contect2 [city=" + city + ", state=" + state + "]";
	}


}
