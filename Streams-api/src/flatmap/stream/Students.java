package flatmap.stream;

import java.util.Arrays;
import java.util.List;

import pojo.Student;

public class Students {
	public static void main(String[] args) {
		List<Student> class1 = Arrays.asList(new Student("Aman", 0), new Student("Ranju", 40), new Student("Sumit", 30),
				new Student("Mausoof", 88));

		List<Student> class2 = Arrays.asList(new Student("Vivek", 35), new Student("Ranjan", -20),
				new Student("Vipul", 30), new Student("Mastana", 40));

		List<Student> class3 = Arrays.asList(new Student("John", -52), new Student("Ravi", 60),
				new Student("Sumit", 30), new Student("Asif", 80));

		List<List<Student>> classes = Arrays.asList(class1, class2, class3);

		List<Student> allClasses = classes.stream().flatMap(student -> student.stream())
				.filter(stud -> stud.getSocre() > 20).toList();

		System.out.println(allClasses);

		// List all student names who failed from all Classes and store back into List / Array
		List<String> failedNameList = classes.stream().flatMap(stud -> stud.stream()).filter(stud -> stud.getSocre() <= 0)
				.map(x -> x.getName()).toList();
		System.err.println(failedNameList);
		
		Object[] failedNameArr = classes.stream().flatMap(stud -> stud.stream()).filter(stud -> stud.getSocre() <= 0)
				.map(x -> x.getName()).toArray();
		
		for (Object name : failedNameArr) {
			System.err.println(name+" you'r Failed!");
		}

		// List all student names with score who failed from all Classes
		List<Student> failedStudentsList = classes.stream().flatMap(students -> students.stream()).filter(student -> student.getSocre() <= 0)
				.map(stud -> stud).toList();
		System.err.println(failedStudentsList);
	}
}
