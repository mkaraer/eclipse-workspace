import java.util.Scanner;

public class excirseMiddleTree {
	public static void main(String[] args)  {
		
		// Ask user to enter a word, if the word has odd number of characters and has 5 or more characters, 
		//print the middle 3 character of word.
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a words; ");
		String entry= scan.nextLine();
		int wordCount= entry.length();
		
//		if(wordCount%2==1 && entry.length()>=5) {
//			System.out.println(entry.substring(3));
		}
		
		
		
		
		boolean isOdd= entry.length()%2==1;
		System.out.println(isOdd);
		
	boolean has5More= entry.length()>=5;
		
		if(isOdd && has5More) {
         int beginIndex= (wordCount-3)/2;
         int endIndex=beginIndex=3;
         
         System.out.println(beginIndex);
         string substring= word.substring(beginIndex,endIndex);
         
         System.out.println(word.substring(beginIndex));
         System.out.println(substring);
			
			
			
			
		}
		
		System.out.println(entry.substring(3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
