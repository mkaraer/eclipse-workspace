package day45_2_this_isa_INHERITANCE;

public class calcTest {
public static void main(String[] args) {
	
	calc c =new calc();
	c.plus(10);
	
	System.out.println(c.getResult());
	c.plus(5).plus(15).plus(3).minus(3);
	System.out.println(c.getResult());
	
	
}
}
