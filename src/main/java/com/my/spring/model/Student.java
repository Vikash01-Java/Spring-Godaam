package com.my.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;
// Auto wire
public class Student {
private int id;
	
	private String name, gender;
	
	private Contect contect;
	
	private List<Integer> list;
	
	private Set<Integer> set;
	
	private Map<Integer , String> map;
	
	public Student() {
		super();
		System.out.println("Student.constructor() no argument");
	}

	

	public Student(int id, String name, String gender, Contect contect, List<Integer> list, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.contect = contect;
		this.list = list;
		this.set = set;
		this.map = map;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Contect getContect() {
		return contect;
	}



	public void setContect(Contect contect) {
		this.contect = contect;
	}



	public List<Integer> getList() {
		return list;
	}



	public void setList(List<Integer> list) {
		this.list = list;
	}



	public Set<Integer> getSet() {
		return set;
	}



	public void setSet(Set<Integer> set) {
		this.set = set;
	}



	public Map<Integer, String> getMap() {
		return map;
	}



	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", contect=" + contect + ", list=" + list
				+ ", set=" + set + ", map=" + map + "]";
	}

	
	
	
}

