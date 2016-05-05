package ro.erni.java.training.tagged.classes;

public class MainApp {

    public static void main(String[] args) {
	Figure cerc = new Figure(20);
	Figure dreptunghi = new Figure(10,30);
	System.out.println(cerc.area());
	System.out.println(dreptunghi.area());
    }

}
