package com.umar.mvc;

public class Food {
	private int id;
	private String item;
	private float price;

	public Food(int id, String item, float price) {
		this.id = id;
		this.item = item;
		this.price = price; 
 	}
 	//getter
 	public int getId() {
 		return id;
 	}
 	public String getItem() {
 		return item;
 	}
 	public float getPrice() {
 		return price;
 	}

 	//setter
 	public void setId(int id) {
 		this.id = id;
 	} 
 	public void setItem(String item) {
 		this.item = item;
 	}
 	public void setPrice(float price) {
 		this.price = price;
 	}
}