package com.my.spring.model;

public class Employee {

	private int id;
	private String name,gender;
	public Employee() {
	
		System.out.println("Employee.employee()");
	}
	public Employee(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Emplyee.setId");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Emloyee.setName");
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		System.out.println("Emloyee.setGender");
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
}
