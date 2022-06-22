package com.snort.intelli.strings;

import java.util.StringJoiner;

public class StringJoinnerApp {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("|");
		sj.add("Hey");
		sj.add("you");
		sj.add("Come");
		sj.add("here");
		
		System.out.println(sj);
		
		//form an array style
		StringJoiner sj2 = new StringJoiner(",","[","]");
		sj2.add("Hey");
		sj2.add("you");
		sj2.add("Come");
		sj2.add("here");
		System.out.println(sj2);
		System.out.println("length : "+sj2.length());
		
		//merge
		StringJoiner sj3 = sj.merge(sj2);
		System.out.println(sj3);
		
		//before add() 
		StringJoiner data  = new StringJoiner(";");
		data.setEmptyValue("This is Empty");
		System.out.println("data : "+data);
		System.out.println("data length : "+data.length());
		
		//after add()
		data.add("How");
		data.add("are");
		data.add("you?");
		System.out.println("data : "+data);
		System.out.println("data length : "+data.length());
		
	}
}
