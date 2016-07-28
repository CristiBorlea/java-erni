package ro.erni.java.training.open.closed.principle;

public class Circle extends Shape {
	public Circle() {
		super.m_type = 2;
	}

	@Override
	void draw() {
		System.out.println("Circle is drown ");

	}
	public double calculareArie(int r){
		 double rez = (3.14*(r*r));
		return rez;
	}
}
