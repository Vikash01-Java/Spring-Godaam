package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.DatabaseSingleton1;

public class App_1_Factory {

	 public static void main( String[] args )
	    {
	    	ApplicationContext factory =    new ClassPathXmlApplicationContext("factory1.xml"); 
	    	DatabaseSingleton1 obj1 =  factory.getBean("dbSingleton",DatabaseSingleton1.class);
	    	DatabaseSingleton1 obj2 =  factory.getBean("dbSingleton",DatabaseSingleton1.class);
	    	DatabaseSingleton1 obj3 =  factory.getBean("dbSingleton",DatabaseSingleton1.class);
			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(obj3);
			
//			ApplicationContext factory1 =    new ClassPathXmlApplicationContext("factory.xml"); 
//			DatabaseSingleton obj1 = (DatabaseSingleton) factory1.getBean("dbSingleton");
//			System.out.println(obj1);
		
	    }

}
