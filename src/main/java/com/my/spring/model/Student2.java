package com.my.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;
//Auto wire
//by default singleton
//scope="prototype"
//scope="singleton"by default
//inner Bean
public class Student2 {
private int id;
	
	private String name, gender;
	
	private Contect2 contect2;
	
	private List<Integer> list;
	
	private Set<Integer> set;
	
	private Map<Integer , String> map;
	
	public Student2() {
		super();
		System.out.println("Student1.constructor() no argument");
	}

	

	public Student2(int id, String name, String gender, Contect2 contect2, List<Integer> list, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.contect2 = contect2;
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



	public Contect2 getContect2() {
		return contect2;
	}



	public void setContect2(Contect2 contect2) {
		this.contect2 = contect2;
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
		return "Student2 [id=" + id + ", name=" + name + ", gender=" + gender + ", contect2=" + contect2 + ", list="
				+ list + ", set=" + set + ", map=" + map + "]";
	}

	
}

