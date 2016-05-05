package ro.erni.java.training.function.objects;

/**
 * 
 * primary use of function pointers is to implement the Strategy pattern. To
 * implement this pattern in Java, declare an interface to represent the
 * strategy, and a class that implements this interface for each concrete
 * strategy. When a concrete strategy is used only once, it is typically
 * declared and instantiated as an anonymous class. When a concrete strategy is
 * designed for repeated use, it is generally implemented as a private static
 * member class and exported in a public static final field whose type is the
 * strategy interface
 */
public class StringLengthComparator2 implements Comparator {

    // could be singleton
    public static final StringLengthComparator2 INSTANCE = new StringLengthComparator2();

    private StringLengthComparator2() {
    }

    public int compare(String s1, String s2) {
	return s1.length() - s2.length();
    }
}
