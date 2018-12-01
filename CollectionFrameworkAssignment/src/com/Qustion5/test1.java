package com.Qustion5;

import java.util.Hashtable;

public class test1 {

	public static void main(String[] args) {
		Hashtable<Integer, Employee> hash= new Hashtable<>();
		
		Employee e1= new Employee(1,"Abhay");
		hash.put(1,e1);
		Employee e2= new Employee(2,"Abhay1");
		hash.put(2,e2);
		Employee e3= new Employee(3,"Abhay2");
		hash.put(3,e3);
		Employee e4= new Employee(2,"Abhay1");
		hash.put(4,e4);
		
		System.out.println(e2.equals(e4));
		System.out.println(e2.equals(e3));

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
	}

}
