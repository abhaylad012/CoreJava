package com.Question1;

@FunctionalInterface
interface CalculatorOperations{
	int operations (int a ,int b);
	}
	
public class ArithmaticOperations {
	
	
	public static void main(String[] args) {
		
		CalculatorOperations add= (a,b) -> (a+b);
		CalculatorOperations sub= (a,b) -> (a-b);
		CalculatorOperations mul= (a,b) -> (a*b);
		CalculatorOperations div= (a,b) -> (a/b);
		
		System.out.println("Addition of two numbers: ");
		System.out.println(add.operations(10, 5));
		
		System.out.println("Subtraction of two numbers: ");
		System.out.println(sub.operations(10, 5));
		
		System.out.println("Multiplication of two numbers: ");
		System.out.println(mul.operations(10, 5));
		
		System.out.println("Division of two numbers: ");
		System.out.println(div.operations(10, 5));
			
	}

}
