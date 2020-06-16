package com.io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void keys(Engine obj) {
		obj.start();
	}

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Engine obj = ac.getBean("engine", Engine.class);
		keys(obj);
	}

}
