package com.Question2;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainOrders {

	public static void main(String[] args) {
		
		List<Orders> order1 = Arrays.asList(new Orders(1, 10000, "Accepted"),
				new Orders(2, 10000, "Accepted"),
				new Orders(3, 15000, "Rejected"),
				new Orders(4, 9000, "Completed"),
				new Orders(5, 20000, "Accepted"),
				new Orders(6, 19000, "Completed"));
		
		
		//order price more than 10000 
		System.out.println("Order price more than 10000  ");
		
		order1.stream().filter(orders -> {
			return orders.getPrice() >= 10000;
		}).collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println(" ");
		
		
		//order status is ACCEPTED or COMPLETED.
		System.out.println("Order status is ACCEPTED or COMPLETED. ");
		
		order1.stream().filter(orders -> {
			return orders.getStatus()=="Accepted" || orders.getStatus()=="Completed" ;
		}).collect(Collectors.toList())
		.forEach(System.out::println);		
		
		System.out.println(" ");

		
		//order price more than 10000  and order status is ACCEPTED or COMPLETED.
		System.out.println("Order price more than 10000  and order status is ACCEPTED or COMPLETED");
		
		order1.stream().filter(orders -> {
			return orders.getPrice() >= 10000 
					&& (orders.getStatus()=="Accepted" || orders.getStatus()=="Completed");})
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
	}

}