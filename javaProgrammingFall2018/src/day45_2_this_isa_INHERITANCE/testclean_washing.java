package day45_2_this_isa_INHERITANCE;

public class testclean_washing {
public static void main(String[] args) {
	
	
	WahingMashine w= new WahingMashine("omo","ariel");
	
	
	Cleaners c= new Cleaners();
	
	c.WahingMashine=w;
	
	System.out.println(c.WahingMashine.softBrand);
	
	
	
}
}
