package terminal.nonterminal.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
	public static void main(String[] args) {
		
		List<String> valueList = Arrays.asList("A", "B", "C", "1", "2", "3");
		//reduce is used in big data 
		Optional<String> x = valueList.stream().reduce((identity, accumulator) -> {
			return accumulator + identity;
		});
		
		System.out.println(x.get());
		
		
	}
}
