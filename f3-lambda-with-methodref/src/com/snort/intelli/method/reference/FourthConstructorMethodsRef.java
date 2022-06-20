package com.snort.intelli.method.reference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.snort.intelli.functional.interfaces.pojo.Student;
import com.snort.intelli.functional.interfaces.pojo.StudentRegistration;

//Referenced by instance : methods signature should be same
/**
 * @author Siddhartha Sharma
 * @website
 * @Note 4th Way : Constructor based method reference
 *
 */
public class FourthConstructorMethodsRef {
	public static void main(String[] args) {
		// print number range & return ArrayList::new object
		Collection<Integer> range = IntStream.range(1, 20).boxed().collect(Collectors.toCollection(ArrayList::new));
		range.forEach(System.out::println);

		// passing student arg
		StudentRegistration student = Student::new;
		String val = student.getName("Aman").getName();
		System.out.println(val);

	}
}
