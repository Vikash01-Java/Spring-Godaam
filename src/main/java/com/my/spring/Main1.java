package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Employeee;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("application1-context.xml");
		
		Employeee bean = ioc.getBean("emp2",Employeee.class);
		System.out.println(bean);
		
	}
}

