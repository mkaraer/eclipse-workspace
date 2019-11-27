package day20_loops;

import java.util.Scanner;

public class startEndLoopWARMUP {
	 public static void main (String[] args) {
		 
		 //1..2. task below
		 //ask user enter 2 numbers for variables star and end
		 // if starts is less than :loop from start to end position and print "Step"+number
		 //if starst is more than end: loop backward from end to start anf print "Step"+number.
		 
		 
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter 2 numbers");
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		
	if(start<end) {
		 System.out.print("looping forward");
			 while (start<=end) {
				
				 System.out.println("step "+ start);
				 start++;
			 }
		
		 }else if(start>end) {
			 System.out.print("looping forward");
			 while (start>=end) {
					
				 System.out.println("step "+ start);
				 start--;
			 
			 }
		 }
		 }
		 
		
		
		// write a program taht accepts a string word
		//and using whilw loop and charat print each char in separete line
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 

}