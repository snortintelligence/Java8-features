package parallel.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import pojo.Student;

public class ParallelStream {
	public static void main(String[] args) {
			List<Student> students = new ArrayList<Student>();
			students.add(new Student("David", 82));
			students.add(new Student("Bob", 90));
			students.add(new Student("John", 65));
			students.add(new Student("Canedy", 55));
			students.add(new Student("Eric", 85));
			students.add(new Student("Smith", 88));
			students.add(new Student("Scott", 50));
			
			Predicate<Student> findByScore = stud->stud.getSocre()>80;
			//using normal stream
			students.stream().filter(findByScore).limit(2).forEach(System.out::println);
			
			//using parallel Stream
			students.parallelStream().filter(findByScore).limit(2).forEach(System.out::println);
			
			//Convert normal to parallel stream
			students.stream().parallel().filter(findByScore).limit(2).forEach(System.out::println);
			
	}
}
