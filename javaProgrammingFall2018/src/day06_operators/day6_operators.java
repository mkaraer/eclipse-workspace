package day06_operators;
import java.util.Scanner;
public class day6_operators {
public static void main(String[] args) {
	
//	Scanner input = new Scanner(System.in);
	
//	System.out.println("Enter miles:");
	
//	double miles = input.nextDouble();
	
//	double km = miles*1.6334;
//	 System.out.println("Kilometers is: " + km);

	Scanner input = new Scanner(System.in);
	System.out.println("Enter current car odometer miles:");
	double curretnOdometer = input.nextDouble();
	
	System.out.println("Enter previous car odometer miles:");
	double previousOdometer = input.nextDouble();
	
	
	System.out.println("Number of Gallons:");
	double gallons = input.nextDouble();
		
	System.out.println("Gas Price:");
	double GasPrice = input.nextDouble();
	
	double mpg = (curretnOdometer-previousOdometer)/gallons;
	System.out.println("Your mpg is: " +mpg);
	
	 
	double totalCost= gallons*GasPrice;
	
	System.out.println("Total Cost is "+ totalCost);
	
	
	
	
	
	
	
	
}
		
		
		
		
		
		
		
	
	}

