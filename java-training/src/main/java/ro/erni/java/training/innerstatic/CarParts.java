package ro.erni.java.training.innerstatic;

public class CarParts {
    
    private int id;
    
    private static int factoryID = 123;
    
    public class Wheel {
    	
        public Wheel() {
            System.out.println("Wheel factory ID: " + factoryID);
            System.out.println("CarParts ID: " + id);
        }
    }

    public CarParts(int id) {
        this.id = id;
        System.out.println("Car Parts object created!");
    }
}
