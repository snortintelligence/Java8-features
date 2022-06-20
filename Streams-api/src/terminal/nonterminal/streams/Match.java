package terminal.nonterminal.streams;

import java.util.HashSet;
import java.util.Set;

public class Match {
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		fruits.add("One apple");
		fruits.add("One mango");
		fruits.add("Two apples");
		fruits.add("More grapes");
		fruits.add("Two guavas");
		
		//anyMatch() : Any value Match with
		boolean result = fruits.stream().anyMatch(value->{
			return value.startsWith("One");
		});
		System.out.println(result);
		
		//allMatch() : All value Match with
		result = fruits.stream().allMatch(value->{
			return value.startsWith("One");
		});
		System.out.println(result);
		
		//noneMatch() : none of the element should not start with the One
				result = fruits.stream().noneMatch(value->{
					return value.startsWith("One");
				});
				System.out.println(result);
	}
}
