package com.my.spring.model;

import com.my.spring.model.DatabaseSingleton;

public class DatabaseSingleton {
	private DatabaseSingleton() {
		System.out.println("DatabaseSingleton.DatabaseSingleton()");
	}

	private static DatabaseSingleton obj = new DatabaseSingleton();

	public static DatabaseSingleton getInstance() {
		System.out.println("DatabaseSingleton.getInstance()");
		return obj;
	}

}
