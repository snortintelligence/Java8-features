package filter.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterStringList {
	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("Siddhartha", null, "Abhishek", "Jayraj", null, "Somya");
		
		Predicate<String> isNotNull = word->word!=null;
		List<String> nameNewList = 
				nameList.stream().filter(isNotNull).collect(Collectors.toList());
		System.out.println(nameNewList);
		
	}
}
