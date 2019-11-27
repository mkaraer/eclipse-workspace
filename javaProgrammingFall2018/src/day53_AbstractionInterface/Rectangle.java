package day53_AbstractionInterface;

public class Rectangle extends Shape{
	int width;
	int heigth;
	
	public Rectangle(String name,int width,int heigth) {
		super(name);
		this.width=width;
		this.heigth=heigth;
		//System.out.println("This is a rectangle");
	}
	
	
	@Override
	public void calculateArea() {
		int result= width*heigth;
		System.out.println(result);
		
	}


	@Override
	public void draw() {
		
	System.out.println("draw");	
	}


	@Override
	public int drawLine(String s) {
		
		return 0;
	}


}
