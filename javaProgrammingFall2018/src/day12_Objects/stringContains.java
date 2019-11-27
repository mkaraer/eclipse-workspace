package day12_Objects;

public class stringContains {
	public static void main(String[] args)  {
		
		String word= "water";
		System.out.println(word.contains("ter")); // it contains these words
		
		System.out.println(word.startsWith("w"));
		System.out.println(word.endsWith("r"));
		
		String str= "";
		System.out.println(str.isEmpty()); //true
		
		String str1= "I am a teacher";
		System.out.println(str1.indexOf("am")); 
		
		
	}
}
