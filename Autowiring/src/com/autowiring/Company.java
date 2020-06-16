package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Company {
	
	HRDept dept;
	
//@value
	@Value("${umar.name}")
	String name;
	String color;
	
	@Autowired 
	public Company(@Qualifier("dept1")HRDept dept) {
		this.dept = dept;
		System.out.println("const");
		
	}
	public void companyWork() {
		if(dept==null)
			System.out.println("No Client No Work");
		else {
			dept.work();
			System.out.println("Name = "+name);
		}
	}

}
