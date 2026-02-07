package com.my.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Employee3;

public class App_beanLifeCycle {
	 public static void main( String[] args )
	    {
		 	ClassPathXmlApplicationContext ioc= new ClassPathXmlApplicationContext("beanLifecycle.xml"); 
	    	Employee3 obj =  ioc.getBean("empA",Employee3.class);
			System.out.println(obj);
			ioc.registerShutdownHook();
	    }

}
