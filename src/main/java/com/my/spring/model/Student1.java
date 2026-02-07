package com.my.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;
//Auto wire
//by default singleton
//scope="prototype"
//scope="singleton"by default
public class Student1 {
private int id;
	
	private String name, gender;
	
	private Contect1 contect1;
	
	private List<Integer> list;
	
	private Set<Integer> set;
	
	private Map<Integer , String> map;
	
	public Student1() {
		super();
		System.out.println("Student1.constructor() no argument");
	}

	

	public Student1(int id, String name, String gender, Contect1 contect1, List<Integer> list, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.contect1 = contect1;
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



	public Contect1 getContect1() {
		return contect1;
	}



	public void setContect1(Contect1 contect1) {
		this.contect1 = contect1;
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

	
}

