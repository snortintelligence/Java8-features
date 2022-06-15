package flatmap.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	public static void main(String[] args) {
		List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5, 6);

		// map(func) takes one input apply some function and return one/single
		// object(One To One)
		List<Integer> list = numsList.stream().map(n -> n * 3).collect(Collectors.toList());
		System.out.println(list);

		// flatMap(func)takes one input(as collection again add it into stream)apply
		// some function and return stream of objects (One To Many)
		List<Integer> series1 = Arrays.asList(1, 2);
		List<Integer> series2 = Arrays.asList(3, 4);
		List<Integer> series3 = Arrays.asList(5, 6);
		// add all series1,series2 and series3 into another list
		List<List<Integer>> finalSeries = Arrays.asList(series1, series2, series3);
		List<Integer> finalResult = finalSeries.stream()
				.flatMap(series -> series.stream().filter(n -> n > 3).map(n -> n * 2)).collect(Collectors.toList());
		System.out.println("finalResult : " + finalResult);

		finalResult = finalSeries.stream().flatMap(series -> series.stream()).collect(Collectors.toList());
		System.out.println("finalResult : " + finalResult);

	}
}
