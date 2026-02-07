package com.my.spring.model;

public class DatabaseSingleton2 {
	private DatabaseSingleton2() {
		System.out.println("DatabaseSingleton2.DatabaseSingleton2()");
	}

	private static DatabaseSingleton2 obj = new DatabaseSingleton2();

	public  DatabaseSingleton2 getInstance() {
		System.out.println("DatabaseSingleton2.getInstance()");
		return obj;
	}
}
