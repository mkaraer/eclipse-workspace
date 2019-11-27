package day47_INHERITANCEIntro;

public class ElectricCar extends Car {
	public static boolean hasBattery=true;
	public int batteryLevelMiles;
	
	public void charge() {
		System.out.println("charging electrical car");
		batteryLevelMiles=500;
	}
	
	

}
