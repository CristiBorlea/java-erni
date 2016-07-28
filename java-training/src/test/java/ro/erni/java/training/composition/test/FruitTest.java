package ro.erni.java.training.composition.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.erni.java.training.composition.Fruit;

public class FruitTest {

	@Test

	public void peelZaFruitForNewFruitTest() {
		Fruit f = new Fruit();
		assertEquals(2, f.peel().peelZaFruit());
	}

	public void peelMethodForNewFruitOnGetPeelCountMethodFromPeelClassTest() {
		Fruit ex = new Fruit();
		assertEquals(1, ex.peel().getPeelCount()); // smth wrong..?!

	}

}
