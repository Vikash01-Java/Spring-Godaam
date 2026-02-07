package com.my.spring.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//@Primary
public class Address6 implements IAddress{
	
 private String city = "Rishikesh";
 private String  state ="UK";

 public Address6() {
	super();
 }

 
 public String getCity() {
	 
	return city;
 }


 public void setCity(String city) {
 this.city =city; 	
 }


 public String getState() {
	return state;
 }


 public void setState(String state) {
 this.state=state;	
 }

 @Override
 public String toString() {
	return "Address6 [city=" + city + ", state=" + state + "]";
 }

 

 
 
}
