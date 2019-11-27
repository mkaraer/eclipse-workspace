package day23_phoneNumber;

import java.util.Scanner;

public class phoneValidation {
	public static void main (String[] args) {
   
		Scanner input = new Scanner(System.in);
    	
    	System.out.println("enter phone number");
		String phoneNumber=input.next();
		
		  if(phoneNumber.startsWith("(")) {
			  if(phoneNumber.length()!=12){
			System.out.println("invalid Length. Must be either 10 or 12 character");
			return;
			  
		  }else {
			 
				  if(phoneNumber.length()!=10){
					  System.out.println("invalid Length. Must be either 10 or 12 character");
					  return;
				  }
		  }
			  System.out.println("length is good"); 
		
		  }if(phoneNumber.charAt(0)=='(') {
			if(phoneNumber.charAt(4)!=')') {
				System.out.println("invalid format");
				return;
			
				
				}
			}
		  System.out.println("paranthesis format works");
		
		  phoneNumber=phoneNumber.replace("(","");
		  phoneNumber=phoneNumber.replace(")","");
		  phoneNumber=phoneNumber.replace("-","");
		
		for(int i=0; i<phoneNumber.length(); i++) {
			if(!(phoneNumber.charAt(i)>='0'&&phoneNumber.charAt(i)<='9')) {
				 System.out.println("invalit character");
			}
		}
		
		 System.out.println("all numbers");
		
		
		
		
		
	}
}
