package com.umar.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigClass.class);
		
		Company c = ac.getBean("company", Company.class);
		
		c.show();
		c.engineer.development();
		
	}

}
