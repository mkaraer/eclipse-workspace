package day40_;

public class movie {
// our class/Template
	String name;
	int length;
	
	
	public void watch() {
		System.out.print("watching movie : "+name);
		System.out.println("it is "+length+"minutes");
	}
	
	public void buy(double price) {
		System.out.println("buying "+name+ "for $ "+ price);
	}
	
	
}
