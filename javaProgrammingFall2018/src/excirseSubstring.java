import java.util.Scanner;

public class excirseSubstring {
	public static void main(String[] args)  {
		
		// Ask user to enter a word, if the word has odd number of characters and has 3 or more characters, print the character in the mmiddle if the word.
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a words; ");
		String entry= scan.nextLine();
		int word= entry.length();
		
		//chcek if the word has odd number oc characters
//		boolean isOdd= entry.length()%2==1;
//		System.out.println("isOdd "+isOdd);
//		
//		boolean  has3ormore= entry.length()>=3;
//		System.out.println(has3ormore);
//		
//		if (isOdd && has3ormore) {
//			// print the character in the middle
//			
//			
//			
//			
//			
//			System.out.println(entry.charAt(mid));
//		}
//		
		
		if(word%2==1 && entry.length()>=3) {
			int mid= word/2;
			System.out.println(entry.charAt(mid));
		}
		
		
		
		
		
		
		
		
		
		
	}
}
