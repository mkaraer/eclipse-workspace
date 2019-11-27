package day14_;

public class trimExample {
	public static void main(String[] args)  {
		//== trim() --- deletes white space at beginning and at the end of the string
		String str= " bla bla";
		
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(str.length());
		System.out.println(str.trim().length());
		
		// chaning === calling methos one after another
		System.out.println(str.trim().length());
		
		str=str.trim();
		
		
		
		
		
		
	}
}
