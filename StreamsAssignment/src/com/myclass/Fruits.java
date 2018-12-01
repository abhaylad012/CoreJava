package com.myclass;

public class Fruits {
	
	String name;
	int calories; 
	int price; 
	String color;
	
	
	public Fruits(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getNmae() {
		return name;
	}
	public void setNmae(String nmae) {
		this.name = nmae;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", calories=" + calories + ", price="
				+ price + ", color=" + color + "]";
	}
	
}
