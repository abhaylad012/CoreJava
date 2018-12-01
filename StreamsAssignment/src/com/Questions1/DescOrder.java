package com.Questions1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.myclass.Fruits;

public class DescOrder {

	public static void main(String[] args) {
		
		List<Fruits> fruits = Arrays.asList(new Fruits("Banana", 150, 100, "Yellow"),
				new Fruits("Mango", 200, 250, "Yellow"),
				new Fruits("Orange", 85, 60, "Orange"),
				new Fruits("Litchi", 60, 96, "White"),
				new Fruits("Grape", 50, 80, "Violet"),
				new Fruits("Watermelon", 90, 100, "Green"),
				new Fruits("Apple", 60, 100, "Red")
				);
		
		
		List<Fruits> f1= fruits.stream().filter(c->c.getCalories()<100).sorted(Comparator.comparing(Fruits::getCalories).reversed())
				.collect(Collectors.toList());
		
		f1.forEach(s-> System.out.println(s.getNmae()+ " Calories "+ s.getCalories()));
		
		
	}

}
