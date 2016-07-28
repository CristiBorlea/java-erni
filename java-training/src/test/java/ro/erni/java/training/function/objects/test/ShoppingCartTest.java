package ro.erni.java.training.function.objects.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ro.erni.java.training.function.objects.ShoppingCart;

public class ShoppingCartTest {
	ShoppingCart s = new ShoppingCart();
	
	@Test
	
	public void testCalculateTotal() {
	
		ShoppingCart s = new ShoppingCart();
		assertEquals(0, s.calculateTotal());;
	}
	

}
