package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	private static ApplicationContext context;
	
	public static void main(String args[]) {
		
		context = new ClassPathXmlApplicationContext("beans.xml");
		
		Company company = context.getBean("company", Company.class);
		
		company.companyWork();
		
	}

}

//autowire  1.constructor 2.byName 3.byType 4.default(constructor)
