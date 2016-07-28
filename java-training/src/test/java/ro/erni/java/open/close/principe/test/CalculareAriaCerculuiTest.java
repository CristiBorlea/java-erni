package ro.erni.java.open.close.principe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.erni.java.training.open.closed.principle.Circle;

public class CalculareAriaCerculuiTest {
	Circle c;
	@Test
	public void compareIfAriaOfCercleIsCorrect() {
		Circle c = new Circle();
		assertArrayEquals("28.26 expected chek if methods return 28.26",28.26, c.calculareArie(3));
		
	}
	private void assertArrayEquals(String string, double d, double calculareArie) {
		// TODO Auto-generated method stub
		

	}
	}
