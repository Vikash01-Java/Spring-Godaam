package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Student2;

public class Main5 {
//inner Bean
	public static void main(String[] args) {

		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("Student2-context.xml");
	     
	     Student2 bean = ioc.getBean(Student2.class);
	     System.out.println(bean);
//	     bean.getContect2().setCity("meerut");
//	     System.out.println(bean);


	}

}
