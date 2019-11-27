package WarmUp;

public class Test {
public static void main(String[] args) {
	
	Building b= new Building("TrumpTower","Hotel",5);
	
	System.out.println(b);
	
	SingleHouse s=new SingleHouse("myhouse", "single", 3, 99);
	s.addDoor();
	s.toString();
	
	
}
}
