package terminal.nonterminal.streams;

import java.util.Arrays;
import java.util.List;

public class DistinctCountry {
	public static void main(String[] args) {

		List<String> countriesList = Arrays.asList("Germany", "Mexico", "Mexico", "UK", "Sweden", "Germany", "France",
				"Spain", "France", "Canada", "UK", "Argentina", "Mexico");

		/*
		 * List only the DISTINCT (remove duplicate) values from the countriesList
		 * SELECT DISTINCT Country FROM countriesList
		 */
		List<String> distinctCountries = countriesList.stream().distinct().toList(); 
		System.out.println("Countries List (with duplicate): \n"+countriesList);
		System.out.println("Countries List (no duplicate): \n"+distinctCountries);
		
		/*
		 * Count the DISTINCT countriesList items
		 * SELECT COUNT(DISTINCT Country) FROM countriesList
		 */
		long count = countriesList.stream().distinct().count();
		System.out.println("Total DISTINCT Countries are : "+count);
		
		//The limit() is used to set an upper limit on the number of objects returned by stream.
		List<String> limited = countriesList.stream().limit(3).toList();
		System.out.println(limited);
		
		
	}
}
