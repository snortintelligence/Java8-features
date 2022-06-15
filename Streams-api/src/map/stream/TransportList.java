package map.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TransportList {
	public static void main(String[] args) {
		List<String> transportList = Arrays.asList("bus", "car", "bicycle", "flight", "train");

		List<String> vehicleList = new ArrayList<>();
		// Without stream api iterate & transform lower-case to upper-case of list items
		for (String v : transportList)
			vehicleList.add(v.toUpperCase());

		System.out.println(vehicleList);
		vehicleList = new ArrayList<>(); // empty list

		// With stream-map api transform lower-case to upper-case of list items
		Function<String, String> toUpper = word -> word.toUpperCase();
		vehicleList = transportList.stream().map(toUpper).collect(Collectors.toList());
		System.out.println(vehicleList);
		
		Function<String, Integer> len = word->word.length();
		transportList.stream().map(len).forEach(v->System.out.println("Word leng : "+v));
		
	}
}
