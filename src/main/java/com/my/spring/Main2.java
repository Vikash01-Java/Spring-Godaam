package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Employee1;


public class Main2 {

	
		public static void main(String[] args) {
			ApplicationContext ioc = new ClassPathXmlApplicationContext("application2-context.xml");
			
			Employee1 bean = ioc.getBean("emp2",Employee1.class);
			System.out.println(bean);
			
		}
	

}
