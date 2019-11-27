import java.util.Random;  // comes together
import java.util.Scanner;

public class secretnumberversion1 {
	public static void main (String[] args) {
		
		
		 Scanner input = new Scanner(System.in);
		 
		Random random= new Random();
		
		
	
	int secretNumber=random.nextInt(10);
	int GuessedNumber;
	
	do {
		System.out.println("Guess the number:");
		 GuessedNumber=input.nextInt();
		
		if( GuessedNumber==secretNumber) {
			System.out.println("Congratulations!");
		}else if(GuessedNumber>secretNumber) {
			System.out.println("too large ");
		}else {
			
		
			System.out.println("too small ");
		}
		}while(GuessedNumber!=secretNumber); 
			
		
	
	}
}



	
	
	
	
	
	
	
	
	
	


