package day20_loops;
import java.util.Random;  // comes together
import java.util.Scanner;

public class secretnumberversion1 {
	public static void main (String[] args) {
		
		
		 Scanner input = new Scanner(System.in);
		 
		Random random= new Random();
		
		
	
	int secretNumber=random.nextInt(10);
	int GuessedNumber;
	//5 chances to guess
	int iTries=0;
	
	do {
		System.out.println("Guess the number:");
		 GuessedNumber=input.nextInt();
		iTries++;
		
		if( GuessedNumber==secretNumber) {
			System.out.println("Congratulations!");
			break;// break statement and loops
			// it will exit the sattement and loop
		}else if(GuessedNumber>secretNumber) {
			System.out.println("too large ");
		}else {
			
		
			System.out.println("too small ");
		}
		if(iTries==5) {
			System.out.println("you lost ");
			System.out.println("secret number is "+secretNumber);
					break;
		}
		}while(GuessedNumber!=secretNumber&& iTries<=5); 
	}
	

}

			//int n=1;
//	while(n<10) {
//		System.out.println("hello ");
//		if(n==5) {
//			braek;
//			n++;
//		}
		
	



	
	
	
	
	
	
	
	
	
	


