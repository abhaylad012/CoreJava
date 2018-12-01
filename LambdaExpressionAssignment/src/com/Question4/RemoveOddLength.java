package com.Question4;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveOddLength {
	
	public static void main(String[] args) {
		List<String> stringOdd = new ArrayList<>();
		
		stringOdd.add("Hello");
		stringOdd.add("Abhay");
		stringOdd.add("Lucy");
		stringOdd.add("Naruto");
		
		stringOdd.removeIf(o->o.length()%2!=0);
		
		System.out.println(stringOdd);
		
		//Using Stream
		List<String> stringOddstream=stringOdd.stream()
		.filter(o->o.length()%2==0)
		.collect(Collectors.toList());
		System.out.println(stringOddstream);

	}
	
}
