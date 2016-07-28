package ro.erni.java.app;


import java.sql.Date;

public class Student {

	private String firstName;
	private String lastName;
	private Date birthDate;
	private int averageMark;
	
	public Student(String firstName,String lastName,Date birthDate,int averageMark){
		this.firstName=firstName;
		this.lastName=lastName;
		this.birthDate=birthDate;
		this.averageMark=averageMark;
	}
	
	public String getFirstName(){
		return this.firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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
}