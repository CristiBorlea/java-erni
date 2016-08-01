package ro.erni.java.app;

import java.time.LocalDate;

import ro.erni.java.interf.StudentsInterface;

public class Student implements StudentsInterface {

	private String firstName;

	private String lastName;

	private LocalDate birthLocalDate;

	private int averageMark;

	public Student(String firstName, String lastName, LocalDate birthLocalDate, int averageMark) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthLocalDate = birthLocalDate;
		this.averageMark = averageMark;
	}

	public Student(Student s) {
		this.firstName = s.getFirstName();
		this.lastName = s.getLastName();
		this.birthLocalDate = s.getBirthLocalDate();
		this.averageMark = s.getAverageMark();
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthLocalDate() {
		return birthLocalDate;
	}

	public void setBirthLocalDate(LocalDate birthLocalDate) {
		this.birthLocalDate = birthLocalDate;
	}

	public int getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(int averageMark) {
		this.averageMark = averageMark;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return firstName + ", " + lastName;
		
		
	}
}
