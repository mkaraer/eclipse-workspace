package day42_costructorThis;

public class carMax {
public static void main(String[] args) {
	
	car carOne=new car();
	carOne.setMake("Acura");
	carOne.setModel("ILX");
	carOne.setType("Sedan");
	carOne.setSpeed(35);
	
	System.out.println("Make: "+carOne.getMake());
	System.out.println("Current Speed "+carOne.getSpeed());
	
	carOne.accelerating(30);
	System.out.println("Current Speed "+carOne.getSpeed());
	
	car cartwo=new car();
	System.out.println("Car2 make: "+cartwo.getMake());
	System.out.println("car 2 model: "+ cartwo.getModel());
	
	car carThree = new car("Coupe","ford","Mustang");
	
	System.out.println("car 3 model: "+ carThree.getModel());
	System.out.println("car 3 model: "+ carThree.getType());
	System.out.println("car 3 model: "+ carThree.getMake());
	
	
	
}
}
