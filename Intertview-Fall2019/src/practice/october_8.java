package practice;

public class october_8 {
	
	

	public static void main(String[] args) {
		
		
		System.out.println(reverse("java"));
		
		
	}
	
	
	public static String reverse (String str) {
		
		String revers="";
		
		for (int  i = str.length()-1;  i >=0; i--) {
			revers+=str.charAt(i);
			
		}
		return revers;
		
	}
	
	
	
	
}
