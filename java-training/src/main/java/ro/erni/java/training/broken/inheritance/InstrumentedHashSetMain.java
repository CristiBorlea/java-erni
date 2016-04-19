package ro.erni.java.training.broken.inheritance;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class InstrumentedHashSetMain {

    public static void main(String[] args) {

		InstrumentedHashSetComp<String> s = new InstrumentedHashSetComp<String>();
		s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		// s.add("Snap");


		System.out.println("count is " + s.getAddCount());

		System.out.println("size is " + s.size());

		// composition example
		Set<Date> s1 = new InstrumentedHashSetComp<Date>(new TreeSet<Date>());

		Set<String> s2 = new InstrumentedHashSetComp<String>(
				new HashSet<String>());

		System.out.println("s1= " + s1.size());
		System.out.println("s2= " + s2.toString());

    }
}