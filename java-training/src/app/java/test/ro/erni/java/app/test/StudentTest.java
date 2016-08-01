package ro.erni.java.app.test;

import static org.junit.Assert.assertEquals;

import java.time.chrono.IsoChronology;

import org.junit.Test;

import ro.erni.java.app.Student;

public class StudentTest {

	@Test
	public void compareIfFirsNameAndAverageMarkAreMatchingTest() {
		Student s = new Student("George", "Pop", IsoChronology.INSTANCE.date(1991, 12, 25), 5);
		assertEquals(5, s.getAverageMark());
		assertEquals("expected for George(first name)", "George", s.getFirstName());
	}

	@Test

	public void compareIfLastNameIsMatchingTest() {
		Student s = new Student("Sam", "Tomphson", IsoChronology.INSTANCE.date(1990, 1, 16), 4);
		assertEquals("Tomphson", s.getLastName());
		assertEquals(1990, s.getBirthLocalDate().getYear());
	}
	
	@Test
	
	public void compareIfLastNameIsMatchinTest() {
		Student s = new Student("Sam", "Tomphson", IsoChronology.INSTANCE.date(1990, 1, 16), 4);
		assertEquals("Tomphson", s.getLastName());
		assertEquals(1990, s.getBirthLocalDate().getYear());
	}
}
