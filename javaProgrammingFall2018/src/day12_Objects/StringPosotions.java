package day12_Objects;

public class StringPosotions {
	public static void main(String[] args)  {
		String alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("A is at position "+ alphabet.indexOf("A"));
		
		int pPosition= alphabet.indexOf("P");
		System.out.println("P is at index "+ pPosition);
		
		int hijLocation= alphabet.indexOf("HIJ");
		System.out.println("HIJ location "+ hijLocation);   // 7 gives you beggining
		
		String sentence= "Today is Sunday and Tomorrow is Monday";
		System.out.println(sentence.indexOf("Sunday"));// start counting from 0 space also a character
		
		System.out.println(sentence.indexOf("a")); //3 from begining
		System.out.println(sentence.lastIndexOf("a"));  // 36
		
		System.out.println(sentence.indexOf("y",5)); // 14 it startting letter 5
		
		if(sentence.indexOf("and")>=0) {
			System.out.println("word is there");	
		}else {
			System.out.println("word is nor there");
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
