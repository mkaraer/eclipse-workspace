package day20_loops;

public class reverseString {
	public static void main (String[] args) {
		//Take a string variable word
		//and reverse it using for loop
		
//		String word="metin";
//		String reversed="";
//		
//		for( int idx=word.length()-1; idx>=0; idx-- ) {
//			reversed=reversed+word.charAt(idx);
//			
//		}
//		System.out.print(reversed);
		
		String str="java";
		String reverse="";
		
		for(int index=str.length()-1; index>=0; index--) {
			reverse+=str.charAt(index);
		}
		System.out.println(reverse);
		
		
		
	}
}
