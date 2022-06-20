package com.snort.intelli.lambdas;

import com.snort.intelli.functional.interfaces.Addition;
import com.snort.intelli.functional.interfaces.Animal;
import com.snort.intelli.functional.interfaces.Greeting;
import com.snort.intelli.functional.interfaces.Subtraction;

public class LambdaExpressions {
	public static void main(String[] args) {
		
		//1. Write a lambda expression for void method with 0 argument
		Greeting saySomething = ()->System.out.println("Welcome in Java8 Session");
		
		//2. Write a lambda expression for void method with few arguments
		Animal animal = hunt->System.out.println(hunt);
				
		//3. Write a lambda expression for non void method with few arguments
		Addition addition = (int x, int y) -> {
			return x + y;
		};

		Subtraction subtraction = (int a, int b) -> a - b;
		
		//output : called above define lambda expressions
		saySomething.greetingMessage();
		
		animal.hunting("Lion hunts zebra");
		
		int result = addition.add(23, 5);
		System.out.println("result : "+result);
		
		result = subtraction.subtract(23, 5);
		System.out.println("result : "+result);
		
	}
}
