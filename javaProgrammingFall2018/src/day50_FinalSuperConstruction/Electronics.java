package day50_FinalSuperConstruction;

public class Electronics extends PruductSuper {
	private double price;
	
	
	public Electronics(String name,double price) {
		super(name);
		this.price=price;
	}
	public Electronics() {
		super("unkown electronics");
		//setName("unkown electronics"); works
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		//return "name: "+getName()+" | "+price; //...works
		return super.toString()+" | "+price;
		//call toString method of parent super class
	}
	@Override
	public void buy() {
		
		super.buy();
		System.out.println("total price: "+price);
	}
	
	
	
	
}
