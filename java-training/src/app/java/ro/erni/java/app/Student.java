package ro.erni.java.app;

import java.time.LocalDate;

import ro.erni.java.interf.StudentsInterface;

public class Student implements StudentsInterface {

	private String firstName;

	private String lastName;

	private LocalDate birthDate;

	private int averageMark;

	public Student(final String firstName, final String lastName, final LocalDate birthDate,
			final Integer averageMark) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.averageMark = averageMark;
	}

	public Student(final Student s) {
		this.firstName = s.getFirstName();
		this.lastName = s.getLastName();
		this.birthDate = s.getBirthDate();
		this.averageMark = s.getAverageMark();
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(final LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(final int averageMark) {
		this.averageMark = averageMark;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return lastName + ", " + firstName + ", " + birthDate;
	}
}
