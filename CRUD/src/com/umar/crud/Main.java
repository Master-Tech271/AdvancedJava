package com.umar.crud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigClass.class);
		
		//get BussinessLayer Object
		
		BussinessLayer buss = ac.getBean("bussinessLayer", BussinessLayer.class);
		buss.selectAll();
		
		buss.insertData("INSERT INTO foodCart (items, price) VALUES ('Cola', 38.90)");
		
		buss.selectAll();
		
		buss.updateData("UPDATE foodcart SET items = 'Pepsi' WHERE id = 9");
		
		buss.deleteData("DELETE FROM foodcart WHERE id = 11");
		
		buss.selectAll();

	}

}
