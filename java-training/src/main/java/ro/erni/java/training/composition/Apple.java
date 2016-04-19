package ro.erni.java.training.composition;

public class Apple {

	private Fruit fruit = new Fruit();

	Apple() {
	}

	// public int peel() {
	// return fruit.peel();
	// }

	public int peel() {

		Peel peel = fruit.peel();
		return peel.getPeelCount();
	}
}
