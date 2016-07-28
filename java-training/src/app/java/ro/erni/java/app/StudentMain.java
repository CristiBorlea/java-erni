package ro.erni.java.app;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
	public static void main(final String[] args) {
		final List<Student> students = new ArrayList<Student>();

		students.add(new Student("Tom", "Smith", IsoChronology.INSTANCE.date(1991, 6, 20), 8));
		students.add(new Student("Sam", "Tomphson", IsoChronology.INSTANCE.date(1990, 1, 16), 4));
		students.add(new Student("Mihai", "Popescu", IsoChronology.INSTANCE.date(1994, 1, 25), 10));
		students.add(new Student("George", "Pop", IsoChronology.INSTANCE.date(1991, 12, 25), 5));
		// Show students
		System.out.println("Students:");
		students.forEach(s -> System.out
				.println(s.getFirstName() + " " + s.getLastName() + " " + s.getBirthDate() + " " + s.getAverageMark()));

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
		students.sort((s1, s2) -> s1.getBirthDate().compareTo(s2.getBirthDate()));
		students.forEach(s -> System.out.println(s.getFirstName() + " " + s.getBirthDate()));

		// Sorting by averageMark
		System.out.println("\nStudents sort by average mark:");
		students.sort((s1, s2) -> Integer.compare(s2.getAverageMark(), s1.getAverageMark()));
		students.forEach(s -> System.out.println(s.getFirstName() + " " + s.getAverageMark()));
				
		// Sorting by averageMarkReversed
		System.out.println("\nStudents sort by average mark reversed:");
		students.sort((s2, s1) -> Integer.compare(s2.getAverageMark(), s1.getAverageMark()));
		students.forEach(s -> System.out.println(s.getFirstName() + " " + s.getAverageMark()));

		getStudentsFromYear(students, 1991);
		getStudentsFromYear(students, 1990);
		getStudentsFromYear(students, 1994);
		getStudentsWithMark(students, 10);

	}

	// Students by ears
	private static void getStudentsFromYear(final List<Student> students, final int year) {
		System.out.println("\nStudents from" + " " + year + ":");
		final List<Student> studentsFromYear = students.stream().filter(s -> s.getBirthDate().getYear() == year)
				.map(Student::new).collect(Collectors.toList());
		studentsFromYear.forEach(s -> System.out.println(s.getFirstName()));
	}

	// Students with AverageMark 10
	private static void getStudentsWithMark(final List<Student> students, final int mark) {
		System.out.println("\n***Students with mark " + mark);
		final List<Student> studentsWithMark = students.stream().filter(s -> s.getAverageMark() == mark)
				.map(Student::new).collect(Collectors.toList());
		studentsWithMark.forEach(s -> System.out.println(s.getFirstName() + " " + s.getAverageMark()));

	}
}
