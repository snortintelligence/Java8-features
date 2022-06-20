package com.snort.intelli.method.reference;

import com.snort.intelli.functional.interfaces.Addition;
import com.snort.intelli.functional.interfaces.Greeting;
import com.snort.intelli.functional.interfaces.MaxNumberFinder;

//Referenced by static : methods signature should be same
/**
 * @author Siddhartha Sharma
 * @website
 * @Note 1st way : Reference to static method
 */
public class FirstStaticMethodRef {
	// same method in : Greeting interface
	public static void greetingMessage() {
		System.out.println("Hi, there!");
	}

	// same method in : MaxNumberFinder interface
	public static int findMax(int a, int b) {
		return a > b ? a : b;
	}

	// same method in : MinNumberFinder interface
	public static int findMin(int a, int b) {
		return a < b ? a : b;
	}

	// same method in : Addition interface
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		// 1. Write a static method reference to replace a lambda expression
		Greeting greeting = FirstStaticMethodRef::greetingMessage;
		greeting.greetingMessage();

		MaxNumberFinder maxFinder = FirstStaticMethodRef::findMax;
		System.out.println("findMax : " + maxFinder.findMax(23, 34));

		// Or any other same signature method you can reuse here of any class
		MaxNumberFinder maxFinder2 = Math::max;
		System.out.println(maxFinder2.findMax(44, 567));

		Addition addition1 = Math::addExact;

		System.out.println("add : " + addition1.add(23, 6));

	}
}
