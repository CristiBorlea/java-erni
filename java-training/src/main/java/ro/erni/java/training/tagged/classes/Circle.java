package ro.erni.java.training.tagged.classes;

public class Circle extends CorrectFigure {

    final double radius;

    public Circle(double radius) {
	this.radius = radius;
    }

    @Override
    public double area() {
	return Math.PI * (radius * radius);
    }

}
