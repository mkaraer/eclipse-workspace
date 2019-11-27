package day28_;

import java.util.Arrays;
import java.util.Scanner;

public class mesutbey1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a phone number:");
		String number = input.next();
//		 
//		 if  (number%5==0&&number%3==0) {
//			 System.out.println("fizz buzz");
//			 
//		 }else if(number%3==0) {
//			 System.out.println("buzz"); 
//		 }else if(number%5==0) {
//			 System.out.println("fizz");
//			 
//		 }

//		int[]a= {5};
//		int[]b= {10};
//		
//		int[] a1=Arrays.copyOf(b,1);
//		System.out.println("b= "+Arrays.toString(a));
//		
//		int[] b1=Arrays.copyOf(a,1);
//		System.out.println("a= "+Arrays.toString(b));
//		
//		 

//		
//		
//		
//		 System.out.println(a);
//		
		// System.out.println(b);

		// 2 3 4 5 6 7 8 9 4 1

		if (number.length() != 12) {
			System.out.println("it is not correct Number");
		} else {
			if (number.startsWith("(") && number.charAt(4) == ')') {

				number = number.replace("(", "");
				number = number.replace(")", "");

				for (int i = 0; i < 10; i++) {

					if (!(number.charAt(i) >= '0' && number.charAt(i) <= '9')) {
						System.out.println("it is not a correct number");
					}

				}

			} else {
				System.out.println("it is not correct number.");
			}
			System.out.println("it is correct number");

		}

	}
}
