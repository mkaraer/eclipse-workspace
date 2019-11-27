package day19_loops02;
import java.util.Scanner;
public class giveme5$ {
	public static void main (String[] args) {
		
		Scanner input= new Scanner(System.in);
		// ask for $5 and keep asking for $5 until you get it
		//or user enters it 
		
		
		
		
		int amount;
		 int tries=3;// it should let 3 times a chance
		do { 
			System.out.println("give me $5");
			amount=input.nextInt();
			
			
		}while(amount !=5); 
		
		System.out.println("Thank you for $5");
		if (tries>4) {
			System.out.println("next time");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
