package ro.erni.java.training.tagged.classes;

/**
 * @author cara
 *
 *         Tagged classes are verbose, error-prone, and inefficient. A tagged
 *         class is just a pallid imitation of a class hierarchy
 */
public class Figure {
	enum Shape {
		RECTANGLE, CIRCLE
	};

	// Tag field - the shape of this figure
	private final Shape shape;
	// These fields are used only if shape is RECTANGLE
	private double length;
	private double width;
	// This field is used only if shape is CIRCLE
	private double radius;

	// Constructor for circle
	public Figure(double radius) {
		shape = Shape.CIRCLE;
		this.radius = radius;
	}

	// Constructor for rectangle
	public Figure(double length, double width) {
		shape = Shape.RECTANGLE;
		this.length = length;
		this.width = width;
	}

	public double area() {
		switch (shape) {
		case RECTANGLE:
			return length * width;
		case CIRCLE:
			return Math.PI * (radius * radius);
		default:
			throw new AssertionError();
		}
	}
}