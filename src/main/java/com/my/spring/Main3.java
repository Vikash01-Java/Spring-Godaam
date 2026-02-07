package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Student;
//Auto wire
public class Main3 {

	public static void main(String[] args) {
     ApplicationContext ioc = new ClassPathXmlApplicationContext("Student-context.xml");
     
     Student bean = ioc.getBean("stu2",Student.class);
     System.out.println(bean);
	

	
	
	}

}
 