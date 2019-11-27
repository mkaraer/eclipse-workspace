package day12_Objects;

import java.util.Scanner;

public class switchingStatement {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		System.out.println("chose your drink");
		String drink= scan.next();
		
		double price= 0.0;
		
		
		switch(drink) {
		case "tea":
			price=3.0;
			break;
		case "coffe":
			price=4.0;
			break;
		case "water":
			price=5.0;
			break;
		case "juice":
			price=3.0;
			break;
		
	}
		
		System.out.println("your total price is "+price);
		
		
		
		
		
		
		
	}
}
