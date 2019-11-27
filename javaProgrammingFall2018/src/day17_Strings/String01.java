package day17_Strings;

public class String01 {
	public static void main(String[] args)  {
		
		//String is a combination of chars
		String greetings= "Hello world!";
		//Print number of characters
		System.out.println(greetings.length());
		int len = greetings.length();
		System.out.println("length "+len);
		
		// print the first character
		// charAt method
		System.out.println(greetings.charAt(0));
	char firsch= greetings.charAt(0);
	System.out.println("First char: "+ firsch);
	
	// print last character. try to use 
	//len variable or dont use
	char lastch= greetings.charAt(11);
	System.out.println("last char: "+ lastch);
	// String index out of range: 12
	//System.out.println(greetings.charAt(len));
	//to fix it
	System.out.println(greetings.charAt(len-1));
		
	char lastCh= greetings.charAt(greetings.length()-1);
	System.out.println("last char: "+lastCh);
	
	// 
		
		
		
		
		
	}
}
