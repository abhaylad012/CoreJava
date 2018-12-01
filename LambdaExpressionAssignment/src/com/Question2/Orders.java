package com.Question2;

public class Orders {
	
	int id;
	int price;
	String status;
	
	public Orders(int id, int price, String status) {
		super();
		this.id = id;
		this.price = price;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Orders [id=" + id + ", price=" + price + ", status=" + status + "]";
	}
	
}
