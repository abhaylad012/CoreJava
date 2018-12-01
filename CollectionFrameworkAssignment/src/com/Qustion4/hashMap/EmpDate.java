package com.Qustion4.hashMap;

import java.util.HashMap;

public class EmpDate {

	public static void main(String[] args) {
		HashMap<MyDate,String> employee = new HashMap<MyDate,String>();
		
		MyDate d1= new MyDate(22, 05, 1996);
		MyDate d2= new MyDate(22, 05, 1997);
		
		employee.put(d1,"Abhay");
		employee.put(d2,"Abhay1");
		
		System.out.println(employee.get(d1));
		System.out.println(employee.get(d2));

	}

}
