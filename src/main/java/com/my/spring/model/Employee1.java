package com.my.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee1 {
	private int id;
	
	private String name, gender;
	
	private Address1 address1;
	
	private List<Integer> list;
	
	private Set<Integer> set;
	
	private Map<Integer , String> map;
	
	public Employee1() {
		super();
		System.out.println("Employee1.constructor() no argument");
	}
	
	
	public Employee1(int id, String name, String gender, Address1 address1, List<Integer> list, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address1 = address1;
		this.list = list;
		this.set = set;
		this.map = map;
		System.out.println("Employee1.Employee1(7)");
	}


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		System.out.println("Emplyee1.setId()");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Emplyee1.setName()");
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		System.out.println("Emplyee1.setGender()");
        this.gender = gender;
	}

	public Address1 getAddress1() {
		return address1;
	}

	public void setAddress1(Address1 address1) {
		System.out.println("Emplyee1.setAddress1()");
		this.address1 = address1;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		System.out.println("Emplyee1.setList()");
		this.list = list;
	}

	public Set<Integer> getSet() {
		return set;
	}

	public void setSet(Set<Integer> set) {
		System.out.println("Emplyee1.setSet()");
		this.set = set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		System.out.println("Emplyee1.setMap()");
		this.map = map;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", gender=" + gender + ", address1=" + address1 + ", list="
				+ list + ", set=" + set + ", map=" + map + "]";
	}



	
}
