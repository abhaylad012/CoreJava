package com.Question5;

import java.util.ArrayList;
import java.util.List;

public class ConsStringBuilder {
	
public static void main(String[] args) {
	
	List<String> stringFirst = new ArrayList<>();
	
	stringFirst.add("Hello");
	stringFirst.add("Abhay");
	stringFirst.add("Kajal");
	stringFirst.add("Naruto");

	
	stringFirst.stream()
		.forEach(o->System.out.println(o.charAt(0)));
	
	System.out.println(stringFirst);

}

}
