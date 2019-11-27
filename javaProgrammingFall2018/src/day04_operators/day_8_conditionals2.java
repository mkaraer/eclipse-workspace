package day04_operators;

import java.util.Scanner;

public class day_8_conditionals2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Batch Number");
		int batch= scanner.nextInt();
		if(batch== 10) {
			System.out.println("We are classmates");
		}else {
			System.out.println("we are in different classes.");
		}
	
		System.out.println("Enter your Pincode");
		int pincode= scanner.nextInt();
		 int pincode1= 10;
		if(pincode== pincode1) {
			System.out.println("Access granted");
			
		}else {
			System.out.println("Denied");
		}
		
		System.out.println("write the number");
		int number= scanner.nextInt();
		if(number%2==0) {
			
		}else {
			System.out.println("Odd Number");
		}
		
		
		
	}
}
