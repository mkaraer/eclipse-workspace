package day53_AbstractionInterface;

public class Circle  extends Shape{
	
	int radius;
	
	public Circle(String name,int radius) {
		super(name);
		this.radius=radius;
		
		//System.out.println("This is a circile");
	}

	@Override
	public void calculateArea() {
		int result=(int) 3.14 *radius*radius;
		System.out.println(result);
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int drawLine(String s) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	

}