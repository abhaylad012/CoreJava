package com.Question6;

import java.util.ArrayList;
import java.util.List;

public class UpperCase {
	public static void main(String[] args) {
		
		List<String> stringUpper = new ArrayList<>();
		
		stringUpper.add("hello");
		stringUpper.add("abhay");
		stringUpper.add("kajal");
		stringUpper.add("naruto");
		
		stringUpper.stream().forEach(u-> System.out.println(u.replaceAll(u, u.toUpperCase())));
		
		
	}

}
