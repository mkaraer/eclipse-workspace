package day33_methodwithReturn;

public class StringMethodsPalidromeReverseFindLetter {
public static void main(String[] args) {
	
	String orijinal="computer ";
	//String reversed = reverse(orijinal);
	//System.out.println(reversed);
	System.out.println("computer");
	
	 boolean isPal= isPalidrome("level");
		System.out.println(isPal);
		System.out.println(isPalidrome("civic"));

		String word="java";
		if(isPalidrome(word)) {
			System.out.println("word is palidrome");
		}else {
			System.out.println("word is not palidrome");
		}
}








private static String reverse(String orijinal) {
	String reversed="";
	
	for(int i=orijinal.length()-1; i>=0; i--) {
		reversed+=orijinal.charAt(i);
		reversed+=orijinal.substring(i,i+1);
	}
		
	   
		
return reversed;
		
	}
	//return reversed;	

	
	
// methods reverse
	//parameters: 1 String
	//return type String
	// It reserves the param string and returns the result
	

// Method is Palidrome
// params: 1 String
//if parameter String is palidrome returns true otherwisw returs false
//isPalidrome(civic)/()racecar--true, sonthing--false

public static boolean isPalidrome( String str) {
	String reversed="";
	for(int i=str.length()-1; i>=0; i--) {
		
	reversed+=str.charAt(i);
		
		}
	if (str.equalsIgnoreCase(reversed)) {
		return true;
	}
	return false;
	//return str.equalsIgnoreCase(str)  it is also possible 
}
// version 2 of isPalidrome that will call reverse method
public static boolean isPalidromeV2(String str) {
	
	//return reverse(str.equalsIgnoreCase(str));
	
	if (str.equalsIgnoreCase(reverse(str))) {
		System.out.println("palidrome");
		return true;
	}
	return false;
}










	
	
}
