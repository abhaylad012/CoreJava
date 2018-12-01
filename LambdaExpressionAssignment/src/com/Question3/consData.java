package com.Question3;

public class consData {
	
	int price;
	String name;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "consData [price=" + price + ", name=" + name + "]";
	}
	public consData(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	

}
