package com.snort.intelli.method.reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachWithList {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(33, 12, 688, 99, 0);

		System.out.println("\n>> annonymous inner class : ");
		numList.forEach(new Consumer<Integer>() {
			public void accept(Integer num) {
				System.out.println(num);
			};
		});

		System.out.println("\n>> lambda expression : ");
		numList.forEach(num -> System.out.println(num));
		
		System.out.println("\n>> method ref (instance to insatnce ): ");
		numList.forEach(System.out::println);


		System.out.println("\n>> sequential stream api");
		Stream<Integer> num = numList.stream();
		num.forEach(v->System.out.println(v));
		
		System.out.println("\n>> sequential stream api");
		num = numList.stream();
		num.forEachOrdered(v->System.out.println(v)); //it doesn't work on normal stream
		
		
		
	}
}
