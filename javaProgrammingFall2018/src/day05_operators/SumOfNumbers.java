package day05_operators;
import java.util.Scanner;

public class SumOfNumbers {
  public static void main(String[] args) {
	  
	  Scanner scan= new Scanner(System.in);
	  
	  System.out.println(" Enter 3 numbers");
	  int num1= scan.nextInt();
	  int num2= scan.nextInt();
	  int num3= scan.nextInt();
	  
	  int sum= num1+num2+num3;
	  
	  System.out.println(" Sum is "+sum);
	  scan.close();
	  
	  
	  int students= 123;
	byte byteStudents= (byte)students;		
	System.out.println(byteStudents);
	// int  byte
	double priceOfSmth= 654.34;
			int intPrice= (int)priceOfSmth;
			System.out.println(intPrice);
	int n= 100;
	double d= n;
	
	double d= 123.4
			int n=(int)d;
	
	
  }
  
  
  
  
  
  
}
