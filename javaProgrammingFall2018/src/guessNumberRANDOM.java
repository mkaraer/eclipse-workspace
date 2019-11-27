import java.util.Random;
import java.util.Scanner;

public class guessNumberRANDOM {
	public static void main (String[] args) {
		
		// Random is a class name
		// the purpose of this class is to generate random numbers
		 Scanner input = new Scanner(System.in);
		 
		Random random= new Random();
		//System.out.println(random.nextInt(10));
		//give me random number between 0 and 9
		
		int num= random.nextInt();
	System.out.println("num value "+ num);
	
	int secretNumber=random.nextInt(10);
	int GuessedNumber=input.nextInt();
	
	do {
		System.out.println("Guess the number:");
		if( GuessedNumber==secretNumber) {
			System.out.println("Congratulations!");
		}else {
			System.out.println("try again ");
		}
		}while(GuessedNumber!=secretNumber); 
			
		
	
	}
}



	
	
	
	
	
	
	
	
	
	


