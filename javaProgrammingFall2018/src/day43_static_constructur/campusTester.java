package day43_static_constructur;

public class campusTester {
public static void main(String[] args) {
	// when use static no neeed to create an object
	Campus.city="Mclean";
	
	//Campus.aboutCampus();
	
	// it is also possible
	Campus c=new Campus();
	System.out.println(c.city);
	
	c.aboutCampus();
	
	
	
	
	
	
}
}
