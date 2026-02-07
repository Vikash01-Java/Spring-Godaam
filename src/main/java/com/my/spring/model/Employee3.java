package com.my.spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Employee3 implements InitializingBean , DisposableBean
{
	private String name;
	int age;
	int salary;
	@Autowired
	Address3 address;
	
	public Employee3() {
	}
	
	public Employee3(String name, int age, int salary, Address3 address) {
  		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

	//InitializingBean method
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee6.afterPropertiesSet()");
	}
	
	//DisposableBean method
	@Override
	public void destroy() throws Exception {
		System.out.println("Employee6.destroy()");
	}
	
	
	private void xmlInitMethod() {
		System.out.println("Employee6.xmlInitMethod()");
	}
	
	private void xmlDestroyMethod() {
		System.out.println("Employee6.xmlDestroyMethod()");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Employee6.setName()");
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
	public Address3 getAddress() {
		return address;
	}
	public void setAddress3(Address3 address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee3 [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
}