package day26_;

import java.util.Arrays;

public class toCharArray {
	public static void main (String[] args) {
		String word="pencil";
		char[] letters=word.toCharArray();
		
		for(char l:letters) {
			System.out.println(l);
		}
		//String reverse="";
		String gift="Diamond Ring";
		//convert to char array and print reverse
		char[] ters= gift.toCharArray();
		
		for(int i=ters.length-1; i>0;  i--) {
			//reverse+=gift.charAt(i);
			
			System.out.print(ters[i]);
		}
		
		//System.out.println(reverse);
		

		
		
		
		
	}
}
