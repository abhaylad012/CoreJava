package com.Questions2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.myclass.Fruits;

public class ColorWise {

	public static void main(String[] args) {
		
		List<Fruits> fruits = Arrays.asList(new Fruits("Banana", 150, 100, "Yellow"),
				new Fruits("Mango", 200, 250, "Yellow"),
				new Fruits("Orange", 85, 60, "Orange"),
				new Fruits("Litchi", 60, 96, "White"),
				new Fruits("Grape", 50, 80, "Violet"),
				new Fruits("Watermelon", 90, 100, "Green"));
		
		List<Fruits> f1= fruits.stream()
				.sorted(Comparator.comparing(Fruits::getColor))
				.collect(Collectors.toList());
			f1.forEach(s->System.out.println(s.getNmae()+" and " +s.getColor()));
	}

}
