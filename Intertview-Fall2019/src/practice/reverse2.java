package practice;

public class reverse2 {

	public static void main(String[] args) {
		
		System.out.println(reverse("java"));
	
	
	}
	

	public static String reverse(String str) {
		
		
	return new StringBuilder(str).reverse().toString();
		
	
	
	}
	
	
}
