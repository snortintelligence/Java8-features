package methods.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
//sorted() , anyMatch() , allMatch(), nonMatch(), findAny() , findFirst() & concatenating stream

public class Numbers {
	public static void main(String[] args) {
			
		List<Integer> numList = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int x = anyIntNumber(50,100);
			numList.add(x);
		}
		
		System.out.println("before sorted : "+numList);
		
		List<Integer>  numSortedList = numList.stream().sorted().toList();
		System.out.println("after sorted : "+numSortedList);
		
		List<Integer>  numReverseSortedList = numList.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println("after reverse sorted : "+numReverseSortedList);
		
	}
	
	private static int anyIntNumber(int min, int max) {
		Random randomInt = new Random();
		int value  = randomInt.nextInt((max-min)+1)+min;
		return value;
	}
	
}
