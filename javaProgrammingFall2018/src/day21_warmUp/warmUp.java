package day21_warmUp;

import java.util.Scanner;

public class warmUp {
	public static void main (String[] args) {
	//Accept a string and is is palindorme print palindorme
		//java ==not palindorme// civic palidorme
		
				 Scanner scan = new Scanner(System.in);
		 System.out.println("write a word");
		 //String output = scan.next();
//		 String palindorme,notPalidorme;
//		 String word;
//		 reverse="";
//		 word.length();
//		 int index=0;
//		reversed=reversed+word.charAt(index);
//		 if (word.charAt(index)-1) {
//			 
//			 while(index<10) {
//				 
//			 }
//			 System.out.println(reverse);
//			 index--;
//		 }
		String word =scan.next();
		String reverse="";
		int index=0;
		for(index=word.length()-1;  index>=0; index--) {
			reverse=reverse+word.charAt(index);
			
		}
		
		
		if(reverse.equalsIgnoreCase(word)) {
			System.out.print("Palindorme "+reverse);

		}else {
			System.out.println("not Palindorme");

		}
		
		
		
	}
}
