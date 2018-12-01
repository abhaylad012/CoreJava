package com.Question2.Hashset.LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SortingOrderedUnordered {

	public static void main(String[] args) {
		
		HashSet<String> set1= new HashSet<String>();
		
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add("four");
		set1.add("five");
		set1.add("six");
		
		LinkedHashSet<String> set2= new LinkedHashSet<String>();
		
		set2.add("one");
		set2.add("two");
		set2.add("three");
		set2.add("four");
		set2.add("five");
		set2.add("six");
		
		System.out.println(set1);
		
		System.out.println("Printing Values of HashSet");
		Iterator<String> itr= set1.iterator();
		 while(itr.hasNext()){
			 System.out.println(itr.next());
		 }

		System.out.println("Printing Values of HashLinkedSet");
		Iterator<String> itr1= set2.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		 
	}

}
