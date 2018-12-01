package com.Questions3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.myclass.Fruits;

public class RedColorAscending {
	
	public static void main(String[] args) {
		List<Fruits> fruits = Arrays.asList(new Fruits("Banana", 150, 100, "Yellow"),
				new Fruits("Mango", 200, 250, "Yellow"),
				new Fruits("Orange", 85, 60, "Orange"),
				new Fruits("Litchi", 60, 96, "White"),
				new Fruits("Grape", 50, 80, "Violet"),
				new Fruits("Apple", 90, 100, "Red"),
				new Fruits("Strawberry", 90, 100, "Red"));
		
		List<Fruits> f1= fruits.stream()
				.filter(f-> f.getColor()=="Red") 
				.sorted(Comparator.comparing(Fruits::getPrice))
				.collect(Collectors.toList());
		
		System.out.println(f1);
		
	}
}
