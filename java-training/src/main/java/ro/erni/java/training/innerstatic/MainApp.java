package ro.erni.java.training.innerstatic;

import ro.erni.java.training.innerstatic.CarPartsStatic.Wheel;

public class MainApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("Static Context: ");
		CarPartsStatic carPartsStatic = new CarPartsStatic();
		Wheel.create();
		System.out.println();
		
		System.out.println("Non-Static Context: ");
		CarParts carParts = new CarParts(2301);
		CarParts.Wheel wheel = carParts.new Wheel();

	}

}
