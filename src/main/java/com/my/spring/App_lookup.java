package com.my.spring;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Address2;
import com.my.spring.model.Employee2;

public class App_lookup {

	
		    public static void main(String[] args) {
			ApplicationContext factory = new ClassPathXmlApplicationContext("lookup.xml");
			Employee2 obj = factory.getBean("empA",Employee2.class);
//			System.out.println(obj);
//			obj.setName("vikash");
			
			Address2 a=obj.applyAddress();
			System.out.println(a);
			obj.setAddress2(a);
			System.out.println(obj);
			
			Address2 a1 = obj.applyAddress();
			System.out.println(a1);
			obj.setAddress2(a1);
			System.out.println(obj);
			
//////			
//////			
//			Address2 a2 = obj.applyAddress();
//			System.out.println(a2);
//			a2.setCity("Noida");
//			System.out.println(a2);

		}
	}


