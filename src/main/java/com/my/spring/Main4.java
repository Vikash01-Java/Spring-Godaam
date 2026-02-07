package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Student1;
//Auto wire
//by default singleton
//scope="prototype"
//scope="singleton"by default
public class Main4 {

	public static void main(String[] args) {
		
     ApplicationContext ioc = new ClassPathXmlApplicationContext("Student1-context.xml");
     
     Student1 bean1 = ioc.getBean("stu",Student1.class);
     Student1 bean2 = ioc.getBean("stu",Student1.class);
     Student1 bean3 = ioc.getBean("stu",Student1.class);
     Student1 bean4 = ioc.getBean("stu",Student1.class);

     System.out.println(bean1);
     System.out.println(bean2);
     System.out.println(bean3);
     System.out.println(bean4);

	

	
	
	}

}