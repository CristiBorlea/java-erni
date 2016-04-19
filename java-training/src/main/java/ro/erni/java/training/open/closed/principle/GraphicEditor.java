package ro.erni.java.training.open.closed.principle;

public class GraphicEditor {
	public void drawShape(Shape s) {
		// if (s.m_type == 1)
		// drawRectangle(s);
		// else if (s.m_type == 2)
		// drawCircle(s);
		s.draw();
	}
	public void drawCircle(Circle r) {
		System.out.println("Circle is drown ");
	}
	public void drawRectangle(Rectangle r) {
		System.out.println("Rectangle is drown ");
	}
	public void drawCube(Cube r) {
		System.out.println("Rectangle is drown ");
	}
}
