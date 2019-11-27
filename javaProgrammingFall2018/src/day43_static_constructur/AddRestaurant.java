package day43_static_constructur;

public class AddRestaurant {
public static void main(String[] args) {
	
	Dinner dad=new Dinner();
	Dinner mam=new Dinner();
	Dinner kid=new Dinner();
	
	
	System.out.println("pizza slices: "+Dinner.pizzaSlices);
	
	dad.takeASlice(2);
	kid.takeASlice(3);
	mam.takeASlice();
	System.out.println("pizza slices: "+Dinner.pizzaSlices);
	mam.takeASlice();
	
	System.out.println("total slices left: "+Dinner.pizzaSlices);
	
	
	
	
}
}
