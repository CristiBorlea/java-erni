package ro.erni.java.training.function.objects;

public class MainApp {
    public static void main(String[] args) {
	ShoppingCart cart = new ShoppingCart();

	Item item1 = new Item("1234", 10);

	cart.addItem(item1);

	// pay by paypal
	cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

	Item item2 = new Item("5678", 40);
	cart.addItem(item2);
	// pay by credit card
	cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }

}
