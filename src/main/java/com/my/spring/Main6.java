package com.my.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.my.spring.model.Employee4;

//@Component
//@Autowired
public class Main6 {

	public static void main(String[] args) {

		ApplicationContext ioc = new AnnotationConfigApplicationContext("com.my.spring.model");
		    Employee4 bean = ioc.getBean("employee4",Employee4.class);
		    
		    bean.getAddress4().setCity("noida");
		    bean.getAddress4().setState("up");

		     System.out.println(bean);

	}

}
