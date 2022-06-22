package com.snort.intelli.strings;

import java.util.Arrays;
import java.util.List;

public class JoinString {
	public static void main(String[] args) {
		String usrDirectory = String.join("/", "usr","file","app");
		System.out.println(usrDirectory);
		
		//List<String> numList = Arrays.asList("Ind", "Aus", "NZL", "UK")
		List<String> numList = Arrays.asList("Ind", "Aus", "NZL", "UK");
		String str = String.join(",", numList);
		System.out.println(str);
	}
}
