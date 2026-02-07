package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.my.spring.model.Employee5;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new AnnotationConfigApplicationContext("com.my.spring");
		Employee5 bean = app.getBean("employee5",Employee5.class);
		System.out.println(bean);

		
//		bean = app.getBean("employee5",Employee5.class);
//		System.out.println(bean);
//		bean = app.getBean("employee5",Employee5.class);
//		System.out.println(bean);

    	
    }
    
}