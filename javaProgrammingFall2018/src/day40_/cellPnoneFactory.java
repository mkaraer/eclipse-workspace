package day40_;

public class cellPnoneFactory {
public static void main(String[] args) {
	// create object form a CellPhone class
	cellPhone phone1= new CellPhone();
	
	phone1.brand="Apple iPhone XS";
	phone1.color="Piano Black";
	phone1.price=99.0;
	
	phone1.call();
	phone1.text();
	// create 2 cellphome objects
	cellPhone phone2= new CellPhone();
	cellPhone phone3= new CellPhone();
	
	//assign value to objects
	phone2.brand="ericson";
	phone2.color="silver";
	phone2.price=30.5;
	
	phone3.brand="htc";
	phone3.color="black";
	phone3.price=350.5;
	
	phone2.call();
	phone3.text();
	
	System.out.println("phone1.brand"+phone1.brand);
	System.out.println("phone2.brand"+phone2.brand);
	System.out.println("phone3.brand"+phone3.brand);
	
	//calculate all 3 ones
	double total=phone1.brand+phone2.brand+phone3.brand;
	System.out.println(total);
	
	//can we update object vlues
	phone1.price=1200.0;
	phone2.price=phone3.price;
	
	
	}
}
