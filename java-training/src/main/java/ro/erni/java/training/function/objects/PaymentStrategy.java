package ro.erni.java.training.function.objects;

/**
 * taken from
 * http://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial
 *
 */
public interface PaymentStrategy {
    public void pay(int amount);
}
