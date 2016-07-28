package ro.erni.java.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.erni.java.training.function.objects.StringLengthComparator;

public class StringCompareTest {

	Object StringCompareTest;

	@Test
	public void testStringCompare() {
		StringLengthComparator a = new StringLengthComparator();
		assertEquals(2, a.compare("aaa", "a"));
	}

}