package map.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import pojo.Employee;

public class EmployeeMap {

	public static void main(String[] args) {

		List<Employee> emplList = Arrays.asList(new Employee(101, "Aman", "Male", "Software Eng.", 25000),
				new Employee(102, "Ridhama", "Female", "Software Architecht", 35000),
				new Employee(103, "Anamika", "Female", "Developer", 23000),
				new Employee(104, "Kishan", "Male", "Devloper", 80000),
				new Employee(105, "Radha", "Female", "Tester", 46000),
				new Employee(106, "Annu", "Female", "Tester", 85000),
				new Employee(101, "Sumit", "Male", "Software Eng.", 33000));

		// Collect all Gender where Where salary>30000
		Predicate<Employee> salarayMoreThan = emp -> emp.getSalary() > 30000;
		List<String> allGender = emplList.stream().filter(salarayMoreThan).map(e -> e.getGender())
				.collect(Collectors.toList());
		
		System.out.println(allGender);
		
		
	}

}
