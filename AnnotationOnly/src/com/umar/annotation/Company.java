package com.umar.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	@Value("${company.name}")
	String companyName;
	
	@Autowired
	@Qualifier("softwareEngineer")
	Engineer engineer;
	
	

//	public Company(softwareEngineer engineer) {
//		this.engineer = engineer;
//	}
	
//	public void setEngineer(softwareEngineer engineer) {
//		this.engineer = engineer;
//	}



	public void show() {
		System.out.println("Hello !! \n companyName = "+companyName);
	}
}
