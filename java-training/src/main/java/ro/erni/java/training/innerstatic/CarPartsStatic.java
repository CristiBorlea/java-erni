package ro.erni.java.training.innerstatic;

public class CarPartsStatic {

	public static class Wheel {
		
		private Wheel(){
		}
		
		public static void create() {
			System.out.println("Wheel created!");
		}
	}

	public CarPartsStatic() {
		System.out.println("Car Parts object created!");
	}
}
