package ro.erni.java.training.inheritance;

import java.util.Date;

public class Sub extends Super {
	private final Date date;
	Sub() {
		date = new Date();
	}

	@Override
	public void overrideMe() {
		System.out.println(date);
		// System.out.println(date.getDay());
	}


}
