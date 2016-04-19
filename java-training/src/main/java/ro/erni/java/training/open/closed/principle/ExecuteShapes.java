package ro.erni.java.training.open.closed.principle;

public class ExecuteShapes {

	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		GraphicEditor ge = new GraphicEditor();
		ge.drawShape(c);
		ge.drawShape(r);

	}

}
