package com.Question1;

import java.util.Set;
import java.util.TreeSet;

public class PersonSorting{
	
	public static void main(String[] args) {
		
		Set<PersonData> personSet=new TreeSet<PersonData>();
		
		//Creating Person Object
		PersonData person1= new PersonData(56,5.4,"Abhay");
		PersonData person2= new PersonData(58,5.0,"jidnyasa");
		PersonData person3= new PersonData(49,5.6,"Kajal");
		PersonData person4= new PersonData(59,5.2,"Vaibhavi");
		PersonData person5= new PersonData(55,5.5,"Raj");
		PersonData person6= new PersonData(56,5.7,"Naruto");
		
		
		personSet.add(person1);
		personSet.add(person2);
		personSet.add(person3);
		personSet.add(person4);
		personSet.add(person5);
		personSet.add(person6);
		
		for(PersonData p: personSet){
		    System.out.println(" "+p.name+" has "+p.weight+" and height "+p.height+" ");  

		}
	}

}