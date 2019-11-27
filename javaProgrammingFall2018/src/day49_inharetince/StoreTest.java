package day49_inharetince;

public class StoreTest {
public static void main(String[] args) {
	
	//Store store1=new Store(); NO Default constructer
	
	Store store1=new Store("Grocery");
	Store store2=new Store(1000.0);
	Store store3=new Store("Computer store ",4500.0);
	
	System.out.println(".....petsmart object....");

	Petsmart pet1=new Petsmart();
	Petsmart pet2=new Petsmart(2000.0);
	System.out.println(".......................");
	
	System.out.println(pet1.getType());
	System.out.println(pet1.getRent());
	
	System.out.println(pet2.getType());
	System.out.println(pet2.getRent());
	
	
}
}
