package ro.erni.java.training.tagged.classes;

public class Rectangle extends CorrectFigure {

    final double length;
    final double width;

    public Rectangle(double length, double width) {
	this.length = length;
	this.width = width;
    }

    @Override
    public double area() {
	return width * length;
    }

}
