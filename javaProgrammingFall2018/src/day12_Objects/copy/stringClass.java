package day12_Objects.copy;

public class stringClass {
	public static void main(String[] args)  {
		
		String name = "Metin";  
		
		// declarin veriable-- String name 
		// veriable nameis name and type is String 
		// hey java i want you to create a verible called name that String object
		//2. assihn object= String object. anything in double quotes is String object that value
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name);
		
		name=name.toLowerCase();
		System.out.println(name);
		System.out.println(name.length());  // metin= count=5 letters
		System.out.println("java".length()); // same
		
		int count= name.length();
		System.out.println("count is"+count);
		
		System.out.println(name.charAt(0));
		
		if (name.charAt(0)=='M') {
			System.out.println("m is first letter");
			}else {
				System.out.println("m is not first letter");
				
			}
		char secondChar= name.charAt(1);
		System.out.println(secondChar);
		
		
		
		
		
		
		
		
		
	}
}
