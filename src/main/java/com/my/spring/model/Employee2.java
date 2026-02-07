package com.my.spring.model;

abstract public class Employee2 {
	
	private String name;
	int age;
	int salary;
	
	Address2 address2;
	
	public abstract Address2 applyAddress();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address2 getAddress2() {
		return address2;
	}
	public void setAddress2(Address2 address2) {
		this.address2 = address2;
	}
	
	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", age=" + age + ", salary=" + salary + ", address2=" + address2 + "]";
	}
}
