package com.Question7;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapEntry {
	
	public static void main(String[] args) {
		
		Map<String,String> appendIntoOne= new HashMap<String,String>();
		
		appendIntoOne.put("one", "Abhay");
		appendIntoOne.put("two", "Abhay1");
		appendIntoOne.put("three", "Abhay2");
		appendIntoOne.put("four", "Abhay3");
		appendIntoOne.put("five", "Abhay4");
		appendIntoOne.put("six", "Abhay5");
		appendIntoOne.put("seven", "Abhay6");
		appendIntoOne.put("eight", "Abhay7");
		
		/*appendIntoOne.entrySet().stream()
		.map(entry->entry.getKey().concat(entry.getValue()))
	      .collect(Collectors.toList());
			System.out.println(appendIntoOne);
		*/
		appendIntoOne.entrySet().stream()
		.collect(Collectors.toMap(Map.Entry::getKey,  Map.Entry::getValue, (a,b) -> a, HashMap::new));
			
		System.out.println(appendIntoOne);

		
	}

}
