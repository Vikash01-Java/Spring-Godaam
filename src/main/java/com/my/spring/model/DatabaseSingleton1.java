package com.my.spring.model;

public class DatabaseSingleton1 {
	
	private DatabaseSingleton1() {
		System.out.println("DatabaseSingleton1.DatabaseSingleton1()");
	}

	private static DatabaseSingleton1 obj = new DatabaseSingleton1();

	public DatabaseSingleton1 getInstance() {
		System.out.println("DatabaseSingleton1.getInstance()");
		return obj;
	}
}
