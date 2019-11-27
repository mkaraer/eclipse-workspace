package day04_operators;
import java.util.Scanner;

public class age {
	public static void main(String[] args) {
//		Scanner scan = new Scanner (System.in);
//		System.out.println("How old are you? ");
//		int age    = scan.nextInt();
//		 
//		System.out.println(age+ "you are too young. ");
		
		
		String[] strs= {"aa","bb","cafd"};
		for(String letters:strs) {
			if(letters.contains("b")){
				System.out.println("b is found ");
			
			}
			for(int i=0; i<strs.length; i++) {
				//System.out.println(strs[i]);
			}
			System.out.print(letters+" ");
		}
		
		
		
	}
	

}
