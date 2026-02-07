package com.my.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
//@Autowired


@Component
public class Employee4 {

	private int id ;
	private String name, gender;
	
	@Autowired
	private Address4 address4;
	public Employee4() {
		super();
	     System.out.println("Employee.Employee()");

	}
	public Employee4(int id, String name, String gender, Address4 address4) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address4 = address4;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
	     System.out.println("Employee.setId()");

		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
	     System.out.println("Employee.setName()");

		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
	     System.out.println("Employee.setGender()");

		this.gender = gender;
	}
	public Address4 getAddress4() {
		return address4;
	}
	public void setAddress4(Address4 address4) {
	     System.out.println("Employee.setAddress()");

		this.address4 = address4;
	}
	@Override
	public String toString() {
		return "Employee4 [id=" + id + ", name=" + name + ", gender=" + gender + ", address4=" + address4 + "]";
	}




	
	
	
}