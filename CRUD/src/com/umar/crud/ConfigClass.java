package com.umar.crud;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.umar.crud")
@PropertySource("classpath:database-info")
public class ConfigClass {

}
