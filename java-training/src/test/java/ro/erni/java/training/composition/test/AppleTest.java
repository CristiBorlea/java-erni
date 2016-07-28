package ro.erni.java.training.composition.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ro.erni.java.training.composition.Apple;

public class AppleTest {

	@Test
	public void CheckForValueOfAppleTest() {
		Apple a = new Apple();
		assertEquals(1, a.peel());

	}

}
