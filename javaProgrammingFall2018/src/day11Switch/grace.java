package day11Switch;

import java.util.Scanner;

public class grace {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter grade");
		
		// char grade = 'A';
		
		char grade= scan.next().charAt(0);
		
		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("accaptable");
			break;
		case 'D':
			System.out.println("Bad");
			
			default:
				System.out.println("invalid");
				break;
			
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
	}
}