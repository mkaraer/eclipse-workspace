package day19_loops02;
import java.util.Scanner;
public class warupLoops {
	public static void main (String[] args) {
		// write a program that takes string word and converts first
		// letter to uppercase and rest to lowercase
		//print it after conversion
		
		Scanner input= new Scanner(System.in);
		System.out.println("Type word to convert: ");
		String word= input.next();
		
		
		word= "virginia";
		// 1.substring to take first letter of the word
//		System.out.println(	word.substring(0,1).toUpperCase());
//		System.out.println(	word.substring(1).toLowerCase());
//		
//		word= word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
		
		System.out.println(word);
		System.out.println(word.substring(0,1).toUpperCase().concat(word.substring(1).toLowerCase()));

		//2.	write a program to print numbers from 1 to 10.
		// in same line separated space
		
		int num=1;
		while(num<=10) {
			System.out.print(num+ " ");
			num++;
		}
		
		System.out.println("num value " +num);
		
		int number=10;
		while(number>=1) {
			System.out.print(number+ " ");
			number--;
		}
		
		
		
		
		
		
		
		
		
	}
}
