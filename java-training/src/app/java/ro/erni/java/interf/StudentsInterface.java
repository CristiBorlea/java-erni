package ro.erni.java.interf;

public interface StudentsInterface {

	default void getName() {
		System.out.println("This is my interface");
	}

}
