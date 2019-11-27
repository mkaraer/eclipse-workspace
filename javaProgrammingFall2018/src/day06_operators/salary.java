package day06_operators;
import java.util.Scanner;
public class salary {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		
		double salary = input.nextDouble();
		double month=30;
		double day= salary/month;
		System.out.println("your salary per day is "+ day);
		
		
		
	}
}
