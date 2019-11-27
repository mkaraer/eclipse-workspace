package day23_phoneNumber;

import java.util.Scanner;

public class phomeNumber {
	public static void main (String[] args) {
		
		
	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("enter phone number");
    String	number=scan.next();
      String areaCode="";
      String state="";
    	   
      if(number.startsWith("(")){
    		   areaCode=number.substring(1,4);
	  }else {
		  areaCode=number.substring(0,3);
	  
	  }
    	   System.out.print(areaCode);
    	   
		switch(areaCode) {
		case"202":
		state="dc";
			break;
		case"703":
			state="virginia";
			break;
		case"209":
			state="california";
			break;
			
		
		}
		
		System.out.print(state);
		
		
	}
}
