package day06_operators;

public class Chars {
	public static void main(String[] args) {
		char letter='a';   // each letter has an acii nuber behind... a=97  A=65
		letter++;           // 98 it is maches in ascii table b
		System.out.println(letter);
		
		int ascii= letter;
		System.out.println(ascii);
		
		char myChar1= 27262;
		System.out.println(myChar1);
		
		char myChar='B';
		++ myChar;
		System.out.println(myChar);
		
		char symbol= '(';
		symbol++;
		System.out.println(symbol);
		
	}
}
