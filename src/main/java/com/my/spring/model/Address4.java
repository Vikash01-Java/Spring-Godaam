package com.my.spring.model;

import org.springframework.stereotype.Component;
//@Component
//@Autowired



@Component
public class Address4 {
	
	private String city , state;

	public Address4() {
		super();
	}

	public Address4(String city, String state) {
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
		return "Address4 [city=" + city + ", state=" + state + "]";
	}
	
	

}
