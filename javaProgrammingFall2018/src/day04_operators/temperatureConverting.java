package day04_operators;

import java.util.Scanner;

public class temperatureConverting {
    public static void main(String[] args ) {
    	
    	
    	
         Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Enter value in Fahrenheit  ");
    	
    	double currentYear = scan.nextInt();
    	
    	double celcius = (5.0/9)*(fahrenheit-32);
    
    	
    	 
    	System.out.println("Temperature in Celcius: "+ celcius);
    }
}
