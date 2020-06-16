package com.umar.annotation;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class hardwareEngineer implements Engineer{

	public void development() {
		System.out.println("Hardware Development");
	}
	
}
