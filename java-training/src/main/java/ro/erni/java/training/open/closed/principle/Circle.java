package ro.erni.java.training.open.closed.principle;

public class Circle extends Shape {
	Circle() {
		super.m_type = 2;
	}

	@Override
	void draw() {
		System.out.println("Circle is drown ");

	}
}
