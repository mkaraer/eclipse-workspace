package day09_conditions;
import java.util.Scanner;
public class findLargerNumber {
	public static void main(String[] args) {
		
		System.out.println("I find the lanrge number" );
		Scanner scan= new Scanner(System.in);
		
//		int num1,num2,max;
//		System.out.println("Enter 2 numbers" );
//		 num1=scan.nextInt();
//		num2= scan.nextInt();
//		 
//		if(num1>num2) {
//			max=num1;
//		}else if(num1>num2) {
//			max=num2;
//		}else {
//			max=num3;
//		}
//		
				
//		System.out.println("max"+max );
		
		System.out.println("============ I find larger number=======" );
		
		int num1,num2,num3,max;
		System.out.println("Enter 3 numbers" );
		 
		num1=scan.nextInt();
		num2= scan.nextInt();
		 num3=scan.nextInt();
		 
		 if (num1>num2&&num1>num3) {
			 max=num1;
		 }else if(num2>num1&&num2>num3) {
			 max=num2;
		 }else {
			 max=num3;
		 }
		 
		 System.out.println("max"+max );
		
		
	}
}
