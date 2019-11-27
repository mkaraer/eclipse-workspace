package day09_conditions;
import java.util.Scanner;
public class tollCalculater {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Total calculation");
		System.out.println("enter distanve:");
		
		
		int miles= scan.nextInt();
        double tollCost=0.0;
		
		if(miles>=0&&miles<100) {
			tollCost=5.0;
			
		}else if(miles>=101 && miles<=500){
			tollCost= 8.0;
		}else if(miles>= 502&& miles <= 1000) {
			tollCost=10.0;
		}else if(miles>1000) {
			tollCost=12.00;
		}else {
			System.out.println("cannot be negative distance");
		}
		System.out.println("total cost $:"+ tollCost);
		
			
	}
	
}
