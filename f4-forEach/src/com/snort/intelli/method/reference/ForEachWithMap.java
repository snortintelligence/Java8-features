package com.snort.intelli.method.reference;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForEachWithMap {
	public static void main(String[] args) {
		Map<Integer, String> numList = new HashMap<>();
		numList.put(1, "One");
		numList.put(2, "Two");
		numList.put(3, "Three");
		numList.put(4, "Four");

		System.out.println("\n>> annonymous inner class : ");
		numList.forEach(new BiConsumer<Integer, String>() {
			public void accept(Integer key, String value) {
				System.out.println("Key : "+key+" , "+value);
			};
		});
		
		System.out.println("\n>> lambda expression : ");
		numList.forEach((k,v)->System.out.println("key : "+k+", value : "+v));
		
	}
}
