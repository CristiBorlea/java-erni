package ro.erni.java.app;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StudentMain {
	  public static void main(String[] args) {
		 

	        List<Student> students= new ArrayList<Student>();
	        listStudents(students);
	    }
	 
	 private static List<Student> createStudentsList(){
		 
		 Student student1=createStudent("Tom", "Smith", "25/09/1991", 8);
		 Student student2=createStudent("Sam", "Tomphson", "12/01/1990", 4);
		 Student student3=createStudent("Mihai", "Popescu", "28/06/1994", 10);
		 List<Student> students = Arrays.asList(student1, student2, student3);
		 return students;
		 
	 }  
	 
	 private static void listStudents(List<Student> students){
		 students.forEach(s -> System.out.println(s.getFirstName()));
	 }
	 
	 private static Student createStudent(String firstName, String LastName, String dateString, int averageMark){
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 Date date = sdf.parse(dateString);
		 return new Student(firstName, LastName, date, averageMark); 
	 }
}