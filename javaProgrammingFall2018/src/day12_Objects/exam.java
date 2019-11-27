package day12_Objects;

import java.util.Scanner;

public class exam {
	
		public static void main(String[] args)  {
			
			 Scanner scan = new Scanner(System.in);
				System.out.println("name");
				
				String name1= scan.next();
			 String name2= scan.next();
			 String name3= scan.next();
			
			if (name1.length()== name2.length() && name2.length()==name3.length()) {
				System.out.println("all the words are the same");
				
					 
				 }else if(name1.length()== name2.length() || name1.length()==name3.length() || name2.length()==name3.length()) {
					
					 System.out.println("all differnt");
				 }else {
					 System.out.println("all are  differnt");
				 }
				
			 }
			     
			 
	}
		

	
		
		
	

