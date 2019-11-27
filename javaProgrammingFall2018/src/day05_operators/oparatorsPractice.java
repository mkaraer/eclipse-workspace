package day05_operators;
import java.util.Scanner;

public class oparatorsPractice {
	public static void main(String[] args) {
		
		int countApples = 5;
		countApples+=10;
		System.out.println(countApples);
		
		int carsInLot= 23;
		carsInLot-= 10;
		System.out.println(carsInLot);
		
		double pizzaSlices=12;
				pizzaSlices/=5;
				System.out.println(pizzaSlices);	
				
//		int minutes = 500;
//		int hours= minutes/60;
//		System.out.println("hours"+ hours);
//		
//		minutes%= 60;
//		System.out.println("Ramaining"+minutes);
//		minutes*=60;
//		
//		int cents= 2000;
//		int dollars =cents/ 100;
//		System.out.println(dollars);
		
				Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter count of pennies you have");

int pennies= keyboard.nextInt();
int dollars,quarters,dimes,nicles,penniesLeft;
 
 dollars=pennies /100;
  pennies%=100;

quarters= pennies/25;
pennies%=25;
System.out.println("Dollars: "+ dollars);

System.out.println("quarters "+quarters);




		
				
	}
	
}
