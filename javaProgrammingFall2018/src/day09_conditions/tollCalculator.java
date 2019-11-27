package day09_conditions;
import java.util.Scanner;
public class tollCalculator {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("---Fico Credit Chart-----")	;
		System.out.println("Enter your credit score");
		
		int creditScore  = scan.nextInt();
		String creditStatus= "unknown";
		int percentage= 0;
		
		if(creditScore<0|| creditScore>80) {
				creditStatus="invalid score";
			}else if(creditScore==0) {
				creditStatus= "no credit history";
			}else if(creditScore>=1&&creditScore<=299) {
				creditStatus= "Bad credit";
			}		else if(creditScore>=300&&creditScore>=579) {
				creditStatus= "poor";
				percentage=16;
		
		
		
		
		
	}
}
