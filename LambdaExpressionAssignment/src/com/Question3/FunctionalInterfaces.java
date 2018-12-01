package com.Question3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
	public static void main(String[] args) {
		
		//Predicate
		Predicate<String> isALongWord = t -> t.length() > 10;
		String s = " Successfully ";
		String s1=" Hello ";
		boolean result = isALongWord.test(s);
		boolean result1 = isALongWord.test(s1);
		
		System.out.println(s+ " is Long Word :"+ result);
		System.out.println(s1+ " is Long Word :"+ result1);
		
		//Consumer
		System.out.println("  ");
		Consumer<consData> updateData = d-> d.setPrice(5);
		consData c= new consData(20, "Abhay");
		updateData.accept(c);
		System.out.println(c.getPrice());
		
		//Supplier
		System.out.println("  ");
		int n=5;
		display(()-> n+10);
		display(()-> n*10);
		
		//Functional
		modifyTheValue(n, val-> val + 10);
	    modifyTheValue(n, val-> val * 100);

	}

	//functional
	private static void modifyTheValue(int n, Function<Integer, Integer> n1) {
		int resultt= n1.apply(n);
		System.out.println(resultt);
		
		
	}
	
	//supllier
	private static void display(Supplier<Integer> n) {
		System.out.println(n.get());
	}
	

}
