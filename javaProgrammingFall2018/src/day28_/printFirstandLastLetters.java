package day28_;

import java.util.Scanner;

public class printFirstandLastLetters {
	public static void main (String[] args) {
		//Scanner input=new Scanner(System.in);
		//int[] nums= {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		
		
		
		
		
		// print last and first letters
		
		String[] words= {"hello","why","by","apple","note"};
		
//		for(String letters:words) {

//			System.out.print(letters.charAt(0));
//			System.out.println(letters.charAt(letters.length()-1));
//			
//			System.out.println(letters.charAt(0)+""+letters.charAt(letters.length()-1));
			
			// 2 nd using Substring   ............
			for(String letters:words) {
				System.out.print(letters.substring(0,1));
				System.out.print(letters.substring(letters.length()-1));
			
			// 3 rd way.......
				for(int i=0; i<words.length; i++) {
					
					System.out.println(words[i].substring(0,1));
					System.out.println(words[i].substring(words[i].length()-1));
			
		}
		

	for(String str:words) {
		System.out.print(str.charAt(0)+" "+ str.charAt(str.length()-1));
		System.out.println(str.substring(0,1)+str.substring(str.length()-1));
	}
		
		
		
		
		
		
		
			}		
		
	}
}
