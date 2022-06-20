package filter.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterProduct {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(0, null, 0));
		products.add(new Product(1, "Hp Laptop", 25000));
		products.add(new Product(2, "Dell Laptop", 30000));
		products.add(new Product(3, "Lenova Laptop", 28000));
		products.add(new Product(4, "Sony Laptop", 23000));
		products.add(new Product(4, "Apple Laptop", 90000));
		Predicate<Product> findproduct = pro -> pro.getPrice() > 25000;
		List<Product> products2 = products.stream().filter(findproduct).collect(Collectors.toList());
		System.out.println(products2);
	}
}
