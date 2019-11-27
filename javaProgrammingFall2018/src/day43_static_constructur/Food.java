package day43_static_constructur;

public class Food {

	private String name;
	private double price;
	private static String brand;
	
	
	
	public Food () {
		
	}
	public Food(String name, double price, String brand) {
		this.name = name;
		this.price = price;
		this.brand = brand;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	
	
}
