package filter.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterNumberList {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(15, 20, 30, 25, 10, 49);
		List<Integer> evenList = new ArrayList<Integer>();
		// Without Stream
		for (int i : numberList) {
			if (i % 2 == 0) {
				evenList.add(i);
			}
		}

		System.out.println("evenList : " + evenList);
		evenList = new ArrayList<Integer>();
		
		Predicate<Integer> evenPredicate = n->n%2==0;
		
		//With Stream api process & store back into a collection var
		evenList = numberList.stream().filter(evenPredicate).collect(Collectors.toList());
		System.out.println("evenList : " + evenList);
		
		//With Stream api process & just print it
		evenList = new ArrayList<Integer>();
		numberList.stream().filter(evenPredicate).forEach(value->System.out.println(value));
		System.out.println("\n");
		evenList = new ArrayList<Integer>();
		numberList.stream().filter(evenPredicate).forEachOrdered(value->System.out.println(value));
		System.out.println("\n");
		evenList = new ArrayList<Integer>();
		numberList.stream().filter(evenPredicate).forEach(System.out::println);

	}

}
