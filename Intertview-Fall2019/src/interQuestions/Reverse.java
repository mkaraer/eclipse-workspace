package interQuestions;

public class Reverse {
	
	public static void main(String[] args) {
		
  System.out.println( reverse("mesut"));
		
	}	
		
		
	public static String reverse(String str) {	
		
	
	
	for (int  i = str.length()-1; i>=0; i--) {
		
		str+=str.charAt(i);
	   
	}
	return str;
	}
	
	
	

}
