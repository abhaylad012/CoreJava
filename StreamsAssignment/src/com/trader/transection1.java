package com.trader;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.myclass.Trader;
import com.myclass.Transaction;

public class transection1 {
	
	public static void main(String[] args) {
		
		/*Trader tr1 = new Trader("Abhay","Mumbai");
		Trader tr2 = new Trader("Kajal","Pune");
		Trader tr3 = new Trader("Vaibhavi","Banglore");
		Trader tr4 = new Trader("Mihir","Banglore");
		Trader tr5 = new Trader("Deva","Banglore");
		*/

		List<Transaction> t1 = Arrays.asList(new Transaction(new Trader("Abhay","Mumbai"), 2011,80000),
				new Transaction(new Trader("Kajal","Pune"), 2012,50000),
				new Transaction(new Trader("Vaibhavi","Banglore"), 2015, 20000),
				new Transaction(new Trader("Mihir","Indore"), 2011, 30000),
				new Transaction(new Trader("Deva","Banglore"), 2010, 60000),
				new Transaction(new Trader("Jagdish","Delhi"), 2015, 70000),
				new Transaction(new Trader("Kaushik","Delhi"), 2013, 10000),
				new Transaction(new Trader("Swati","Banglore"), 2009, 90000)
				);
		
		//Question 8
		List<Transaction> sortByValue = t1.stream()
				.filter(y->y.getYear()==2011)
				.sorted(Comparator.comparing(Transaction :: getValue))
				.collect(Collectors.toList());
		
		sortByValue.forEach(o->System.out.println("All transactions in the year 2011 sorted by value "
				+ o.getTrader().getName()
				+" With Values "+ o.getValue()));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		//Question 9 Distinct Cities
		System.out.println(t1.stream().map(c-> c.getTrader().getCity())
		 .distinct()
		 .collect(Collectors.toSet()));
		System.out.println("=================================================================================");
		
		//Question 10 sorted by name in city pune
		t1.stream().filter(c-> c.getTrader().getCity()=="Pune")
			.sorted((s1,s2)->s1.getTrader().getName().compareTo(s2.getTrader().getName()))
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println("==================================================================================");
		
		//Question 11 sorted by names and returned string of names
		t1.stream().sorted((s1,s2)->s1.getTrader().getName().compareTo(s2.getTrader().getName()))
			.collect(Collectors.toList())
			.forEach(o->System.out.println("Sorted by names "
				+ o.getTrader().getName()));
		System.out.println("===================================================================================");
		
		//Question 12
		boolean indoreIsThere=t1.stream()
				.anyMatch(i-> i.getTrader().getCity()=="Indore");
		System.out.println("Is indore is available in cities of traders is : "+indoreIsThere);
		
		System.out.println("======================================================================================");
		
		//Question 13 
		t1.stream()
			.filter(f->f.getTrader().getCity()=="Delhi")
			.collect(Collectors.toList())
			.forEach(o->System.out.println(o.getTrader().getName()+" With values" + o.getValue()));
		System.out.println("======================================================================================");

		//Question 14
		Optional<Transaction> maxValue=t1.stream()
			.max(Comparator.comparing(Transaction::getValue));
		
		System.out.println("Maximum value in transaction "+maxValue.get().getValue());
		
		System.out.println("======================================================================================");

		//Question 15
		Optional<Transaction> minValue=t1.stream()
				.min(Comparator.comparing(Transaction::getValue));
			
			System.out.println("Minimumul value in transaction "+minValue.get().getValue());
		
		}
	

}
