package com.my.spring.model;

public class Employeee {
	private int id;
	private String name,gender;
	
	private Address address;
	
	public Employeee() {
		super();
		System.out.println("Employeee.constructor() no argument");
	}
	
	public Employeee(int id, String name, String gender, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		System.out.println("Employeee.constructor(4) parameterize");

	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Employeee.employeee() no argument");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Employeee.setter no argument");	
		this.name = name;
	}

	public String getGender() {
		
		return gender;
	}

	public void setGender(String gender) {
		System.out.println("Employeee.setter no argument");	
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Employeee.setter no argument");	
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

	
	

}
