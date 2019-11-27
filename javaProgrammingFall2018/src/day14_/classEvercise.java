package day14_;

import java.util.Scanner;

public class classEvercise {
	public static void main(String[] args)  {
		
//		Scanner scan= new Scanner (System.in);
//		System.out.println("Enter 2 words; ");
//		
//		String one= scan.nextLine();
//		String two= scan.nextLine();
//		
//		
		
		//System.out.println(one+two+one+two);
		//System.out.println(one.concat(two).concat(two).concat(one));
//		
		
//		Scanner scan= new Scanner (System.in);
//		System.out.println("Please enter the value for nextLine ");
//		String nextLine= scan.nextLine();// nextLine
//		String next= scan.next();// next
//		
//		System.out.println(nextLine);
//		System.out.println(next);
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a words; ");
		String one= scan.nextLine();
		
		System.out.println("Enter another words; ");
		String two= scan.nextLine();
		
		int lenth= one.length();
		System.out.println(lenth);
		
		char last=one.charAt(lenth-1);
		System.out.println(last);
		
		char first= two.charAt(0);
		System.out.println("first "+first);
		
		if(last==first) {
			System.out.println(one+two.substring(1));
		}else {
			System.out.println(one+two);
		}
		
			
			
			
			
		
		
		
		
		
		
		
		
		
		
	}
}
