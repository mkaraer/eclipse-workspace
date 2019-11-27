package day53_AbstractionInterface;

public abstract class Shape implements Drawable{
  String name;
  
  public Shape(String name) {
	  this.name=name;
  }
  public abstract void calculateArea();
  
	
	
	

}
