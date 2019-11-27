package day21_warmUp;

import java.util.Scanner;

public class warmUpCharecter {
	public static void main (String[] args) {
		// Accept a string and a character Find out how many times that character appears in the string.
		Scanner scan = new Scanner(System.in);
		 System.out.println("write a word");
		 String word = scan.next();	
		 System.out.println("write a character");
		 String chars = scan.next();
		 
		
		 int counter=0;
		
		 for( int inx=0; inx<word.length(); inx++) {
			 
			 if(word.charAt(inx)==chars.charAt(0)) {
				 counter++;
			 }
			 
			 
		 }
		 System.out.println(counter);
		
		
		
		
		
		
		
		
	}
}
