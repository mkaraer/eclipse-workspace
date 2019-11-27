package day47_INHERITANCEIntro;

public class Vehicle {

	public String makeAndModel; //private will not work
	public int year;
	public int maxSpeed;
	public int mileage;
	
	public static void service() {
		System.out.println("static sevice");
	}
	
	public void drive() {
		System.out.println("driving");
	}
	public void stop() {
		System.out.println("stopping");
	}
	
	
}
