package com.umar.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@ComponentScan(basePackages = "com.umar.annotation")
@PropertySource("classpath:company-info")
public class ConfigClass {
	
//	@Bean 
//	public softwareEngineer engineer() {
//		return new softwareEngineer();
//	}
	
//	@Bean
//	public Company company() {
//		Company company = new Company();
//		company.setEngineer(engineer());
//		return company;
//	}
//	
//	@Bean
//	public Company company() {
//		Company company = new Company(engineer());
//		return company;
//	}
	
}
