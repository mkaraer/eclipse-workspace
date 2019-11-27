package day20_loops;

import java.util.Scanner;

public class CharWhileLoop {
	 public static void main (String[] args) {
		// write a program taht accepts a string word
			//and using while loop and charat print each char in separete line
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("write a word");
		 String str = scan.next();
		 
		 
		 int index= 0;
		 
		 while(index< str.length()) {
			 System.out.println(str.charAt(index));
			 index++;
		 
		 
		 }
	 }
}
