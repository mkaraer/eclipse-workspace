package day06_operators;

import java.util.Scanner;

public class day7Conditional {
  public static void main(String[] args) {
	
	  Scanner input = new Scanner(System.in);
	 System.out.println("Enter amount");
	  double currency = input.nextDouble();
	  double dollar= 0.9144;
	  double Euro= dollar*currency;
	    
	  double euro1= 1.1633;
	  double euro2= euro1*currency;
	  System.out.println("euro"+Euro);	  
	    
	  System.out.println("usd "+ euro2);	 
			 
	  
	  
	  
	  
	  
  }
}
