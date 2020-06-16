package com.di;

public class Car {
	Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	public void startEngine() {
		if(engine==null)
			System.out.println("Engine Unable to Start!..");
		else
			engine.start();
	}
}
