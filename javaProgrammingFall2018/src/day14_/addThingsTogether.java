package day14_;

import java.util.Scanner;

public class addThingsTogether {
	public static void main(String[] args)  {
		String domain="@cybertech.com";
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter your user name: ");
		
		String entry= scan.nextLine();	
		System.out.println("This is your new email. ");
		
		System.out.println(entry.concat(domain)); //This is your new email.mtn@cybertech.com
		 
		
		
		
		
		
		
		
		
		
	}
}
