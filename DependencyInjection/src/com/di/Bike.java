package com.di;

public class Bike {
	
	Engine engine;
	
	public Bike(Engine engine) {
		this.engine = engine;
	}
	
	public void startEngine() {
		if(engine==null) {
			System.out.println("Engine is Unable to start");
		}
		else 
			engine.start();
	}
	
//	String color;
//	public Bike(String color) {
//		this.color = color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	void show() {
//		System.err.println("Color = "+color);
//	}
}
