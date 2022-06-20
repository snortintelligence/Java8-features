package com.snort.intelli.method.reference;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import com.snort.intelli.functional.interfaces.Greeting;
import com.snort.intelli.functional.interfaces.MaxNumberFinder;
import com.snort.intelli.functional.interfaces.MinNumberFinder;

//Referenced by instance : methods signature should be same
/**
 * @author Siddhartha Sharma
 * @website
 * @Note 3rd Way : Reference to instance method from instance
 *
 */
public class ThirdInstanceMethodsRef {
	// same method in : Greeting interface
	public void greetingMessage() {
		System.out.println("Hi, there!");
	}

	// same method in : MaxNumberFinder interface
	public int findMax(int a, int b) {
		return a > b ? a : b;
	}

	// same method in : MinNumberFinder interface
	public int findMin(int a, int b) {
		return a < b ? a : b;
	}

	// same method in : Addition interface
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		// 1. Write a non static method reference to replace a lambda expression
		Greeting greeting = new ThirdInstanceMethodsRef()::greetingMessage;
		greeting.greetingMessage();

		MaxNumberFinder maxFinder = new ThirdInstanceMethodsRef()::findMax;
		System.out.println("findMax : " + maxFinder.findMax(23, 34));

		MinNumberFinder minFinder = new ThirdInstanceMethodsRef()::findMin;
		System.out.println("findMin : " + minFinder.findMin(23, 324));
		System.out.println();

		List<Integer> numList = Arrays.asList(110, 20, 310, 420, 530);
		PrintStream out = System.out;
		numList.forEach(out::println);

		numList.sort(Integer::compareTo);
		numList.forEach(out::println);

	}
}
