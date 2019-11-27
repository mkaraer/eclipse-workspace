package day24_;

import java.util.Scanner;

public class ibrahimPalidrom {
	public static void main (String[] args) {
//		Scanner input=new Scanner(System.in);
//		System.out.println("write the word");
//		String word=input.next();
//		
//			String reverse="";
//			
//			
//			for(int i=word.length()-1; i>=0; i--) {
//				reverse+=word.charAt(i);
//				
//			}
//			if(word.equals(reverse)) {
//				System.out.println("it is palidrome");
//				
//			}else {
//				System.out.println("not palidrome");
//			}
//			System.out.println(reverse);
//		int number1=10;
//		int number2=20;
//		int number3=30;
//		int max=number1;
//		for(int i=0; i<=3; i++) {
//		if(max<number2) {
//			max=number2;
//		}else if (max<number3){
//			max=number3;
//		}else {
//			System.out.println(max+" is the laargest number");
//
//		}
//		}
//		
//		System.out.println(max+" is the laargest number");
//
//		
		String word="hello";
		String temp;
		
//		for(int index=0; index<word.length(); index++ ) {
//				temp=word.charAt(index);
//				System.out.print(""+word.charAt(index)+temp);
		for(int k=0; k<word.length(); k++ ) {
			//System.out.print(""+word.substring(k,k+1));
	 //temp=word.substring(k,k+1);
	 System.out.println(word.substring(k,k+1)+word.substring(k,k+1));
		
		
		
		
			}
		
		
		int counter=0;
		
		for(int i=0;i<word.length();i++) {
			
		
			if(word.charAt(i)=='e') {
				System.out.print(word.charAt(i));
			}
		}
		System.out.println();

		
		for(int i=0;i<word.length();i++) {
			for(int u=0;u<word.length();u++) {
				if((i!=u)&&word.charAt(i)==word.charAt(u)) {
					System.out.print(word.charAt(i));
					break;
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
