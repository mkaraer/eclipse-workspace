package day49_inharetince;

public class Cat extends Animal {
public Cat() {
	super("garfield");
	System.out.println("Cat object is created");
	
}
@Override
public void speak() {
	System.out.println("meaw");
}
	

}
