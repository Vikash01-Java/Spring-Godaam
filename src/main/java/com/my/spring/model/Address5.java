package com.my.spring.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Address5 implements IAddress {
	private String city = "shimla";
	private String state = "HP";

	public Address5() {
	}

	@Override
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
		return "Address5 [city=" + city + ", state=" + state + "]";
	}
}