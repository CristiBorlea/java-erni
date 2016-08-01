package ro.erni.java.app;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class StudentMain {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student("Tom", "Smith", IsoChronology.INSTANCE.date(1991, 6, 20), 8));
		students.add(new Student("Sam", "Tomphson", IsoChronology.INSTANCE.date(1990, 1, 16), 4));
		students.add(new Student("Mihai", "Chis", IsoChronology.INSTANCE.date(1994, 1, 25), 10));
		students.add(new Student("George", "Popc", IsoChronology.INSTANCE.date(1991, 12, 25), 5));
		// Show students
		System.out.println("Students:");
		students.forEach(s -> System.out.println(
				s.getFirstName() + " " + s.getLastName() + " " + s.getBirthLocalDate() + " " + s.getAverageMark()));

		// Sorting by FirstName
		System.out.println("\nStudents sort by First Name:");
		students.sort((s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()));
		students.forEach(s -> System.out.println(s.getFirstName()));

		// Sorting by LastName
		System.out.println("\nStundents sort by LastName:");
		students.sort((s1, s2) -> s1.getLastName().compareTo(s2.getLastName()));
		students.forEach(s -> System.out.println(s.getLastName()));

		// Sorting by birth date
		System.out.println("\nStudents sort by birth date:");
		students.sort((s1, s2) -> s1.getBirthLocalDate().compareTo(s2.getBirthLocalDate()));
		students.forEach(s -> System.out.println(s.getFirstName() + " " + s.getBirthLocalDate()));

		// Sorting by averageMark
		System.out.println("\nStudents sort by average mark:");
		students.sort((s1, s2) -> Integer.compare(s2.getAverageMark(), s1.getAverageMark()));
		students.forEach(s -> System.out.println(s.getFirstName() + " " + s.getAverageMark()));

		// Sorting by averageMarkReversed
		System.out.println("\nStudents sort by average mark reversed:");
		students.sort((s2, s1) -> Integer.compare(s2.getAverageMark(), s1.getAverageMark()));
		students.forEach(s -> System.out.println(s.getFirstName() + " " + s.getAverageMark()));

		getStudentsWithC(students, "c");
		getStudentsFromYear(students, 1991);
		getStudentsFromYear(students, 1990);
		getStudentsFromYear(students, 1994);
		getStudentsWithMark(students, 10);
		groupStudents(students);
		concatenateStudentsName(students);
		calculateAverageMark(students);
		chekIfEven(students);
	}

	// Students by ears
	private static void getStudentsFromYear(List<Student> students, int year) {
		System.out.println("\nStudents from" + " " + year + ":");
		List<Student> studentsFromYear = students.stream().filter(s -> s.getBirthLocalDate().getYear() == year)
				.map(Student::new).collect(Collectors.toList());
		studentsFromYear.forEach(s -> System.out.println(s.getFirstName()));
	}

	// Students with AverageMark 10
	private static void getStudentsWithMark(List<Student> students, int mark) {
		System.out.println("\n");
		List<Student> studentsWithMark = students.stream().filter(s -> s.getAverageMark() == mark).map(Student::new)
				.collect(Collectors.toList());

		studentsWithMark.forEach(
				s -> System.out.println("Students with mark 10:" + "\n" + s.getFirstName() + " " + s.getAverageMark()));

	}

	public static void groupStudents(List<Student> students) {
		Map<Object, List<Student>> collect = students.stream().collect(Collectors.groupingBy(s -> s.getFirstName()));
		System.out.println("\nStudents grouped by First name:" + "\n" + collect);
	}

	private static void getStudentsWithC(List<Student> students, String ch) {
		System.out.println("\nIs students with 'c'? : -> ");
		List<Student> studentsWithC = students.stream().filter(s -> s.getLastName().toLowerCase().contains(ch))
				.map(Student::new).collect(Collectors.toList());
		boolean anyMatchA = students.stream().anyMatch(s -> s.getLastName().toLowerCase().contains(ch));
		System.out.println(anyMatchA);
		System.out.println("\nStudents with 'c' in Last Name: ");
		studentsWithC.forEach(s -> System.out.println(s.getLastName()));
	}

	private static void concatenateStudentsName(List<Student> students) {
		System.out.println("\nConcatenate Name:");
		students.stream().map(s -> s.getFirstName() + "" + s.getLastName()).forEach(s -> System.out.println(s));
	}

	private static void calculateAverageMark(List<Student> students) {
		System.out.println("\nThe average mark is:");

		System.out.println(students.stream().map(s -> s.getAverageMark()).mapToInt(val -> val).average().getAsDouble());

	}

	private static void chekIfEven(List<Student> students) {
		System.out.println("\nThe list of string is even:");
		students.stream().map(s -> s.getFirstName()).forEach(s -> {
			if (s.length() % 2 == 0)
				System.out.println(s.toUpperCase());
			else
				System.out.println(s);
		});
		
	}

}
