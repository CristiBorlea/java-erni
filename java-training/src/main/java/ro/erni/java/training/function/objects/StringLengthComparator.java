package ro.erni.java.training.function.objects;

/**
 * 
 * An object whose methods perform operations on other objects, passed
 * explicitly to the methods. An instance of a class that exports exactly one
 * such method is effectively a pointer to that method. Such instances are known
 * as function objects.
 * 
 * @author cara A reference to a StringLengthComparator object serves as a
 *         “function pointer” to this comparator, allowing it to be invoked on
 *         arbitrary pairs of strings. In other words, a StringLengthComparator
 *         instance is a concrete strategy for string comparison.
 */
public class StringLengthComparator {

	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}
