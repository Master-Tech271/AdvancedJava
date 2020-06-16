package com.umar.annotation;

import org.springframework.stereotype.Component;

@Component
public class softwareEngineer implements Engineer{

	public void development() {
		System.out.println("Software Development");
	}
	
}
