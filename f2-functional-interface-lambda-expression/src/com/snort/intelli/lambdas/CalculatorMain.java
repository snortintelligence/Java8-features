package com.snort.intelli.lambdas;

import com.snort.intelli.functional.interfaces.Addition;
import com.snort.intelli.functional.interfaces.Divide;
import com.snort.intelli.functional.interfaces.Modulus;
import com.snort.intelli.functional.interfaces.Multiplication;
import com.snort.intelli.functional.interfaces.Subtraction;

public class CalculatorMain {
	public static void main(String[] args) {

		Addition addition = (int x, int y) -> {
			return x + y;
		};

		Subtraction subtraction = (int a, int b) -> a - b;

		Multiplication multiplication = (int a, int b) -> {
			return a * b;
		};

		Divide divide = (int a, int b) -> {
			return a / b;
		};

		Modulus modulus = (int a, int b) -> {
			return a % b;
		};
		
		System.out.println("addition : "+addition.add(10, 2));
		System.out.println("subtraction : "+subtraction.subtract(10, 2));
		System.out.println("multiplication : "+multiplication.multiply(12, 3));
		System.out.println("divide : "+divide.divison(12, 3));
		System.out.println("modulus : "+modulus.mod(13, 2));
		

	}
}
