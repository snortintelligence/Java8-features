package terminal.nonterminal.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class SortedList {
	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<Integer>();

		for (int i = 1; i <= 17; i++) {
			numList.add(i);
		}

		Predicate<Integer> findEven = num -> num % 2 == 0;
		Predicate<Integer> findOdd = num -> num % 2 == 1;

		long totalEvenNos = numList.stream().filter(findEven).count();
		long totalOddNos = numList.stream().filter(findOdd).count();

		System.out.println("Total Nos : " + numList);
		System.out.println("Total Even no Count : " + totalEvenNos);

		System.out.println("Total Odd no Count : " + totalOddNos);

		// find min / max
		Optional<Integer> min = numList.stream().min((value1, value2) -> {
			return value1.compareTo(value2);
		});
		System.out.println("min : " + min.get());

		Optional<Integer> max = numList.stream().max((value1, value2) -> {
			return value1.compareTo(value2);
		});
		System.out.println("max : " + max.get());

		List<String> countriesList = 
				Arrays.asList("Germany", "Mexico", "Mexico", "UK", "Sweden", 
				"Germany", "France", "Spain", "France", 
				"Canada", "UK", "Argentina", "Mexico");

		List<String> sortedCountriesList = countriesList.stream().sorted().toList();
		System.out.println(sortedCountriesList );
		
		List<String> sortedReverseCountriesList = countriesList.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(sortedReverseCountriesList);
	}
}
