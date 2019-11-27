package day53_AbstractionInterface;

public class RectangleTest  {
public static void main(String[] args) {
	
	Rectangle r1=new Rectangle("rec1", 3, 11);
	Rectangle r2=new Rectangle("rec2", 31, 21);
	r1.calculateArea();
	r1.calculateArea();
	
	Circle c1= new Circle("cir1",5);
	Circle c2= new Circle("cir2",12);
	c1.calculateArea();
	c2.calculateArea();
	
	c1.draw();
	c1.drawLine("ded");
	r1.draw();
	r1.drawSquare();
	
	System.out.println(r1.COLOR);
	
	
	
	
	
	
	
	
	
	
	
}
}
