package day39_stringBuilder;

public class strinBuilderComparing {
public static void main(String[] args) {
	StringBuilder builder1= new StringBuilder("java");
	StringBuilder builder2= new StringBuilder("java");
	
	System.out.println(builder1==builder2);// false both objects are different locations
	System.out.println(builder1.equals(builder2));// false equals metod in builder also check same location
	//how can we compare
	/*
	 * convert to String then call Strings equals method
	 */
	boolean isEqual= builder1.toString().equals(builder2.toString());
	System.out.println(isEqual);
	
	StringBuilder builder3=builder1;
	System.out.println(builder3==builder1);
	
	
	
	
	
	
	
}
}
