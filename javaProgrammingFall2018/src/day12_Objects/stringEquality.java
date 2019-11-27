package day12_Objects;

public class stringEquality {
	public static void main(String[] args)  {
		
	String str1="abc";
	String str2="abc";
			
	System.out.println(str1==str2);
		
		String  str3 =new String("abc");
		String str4= "abc";
		System.out.println(str3.equals(str4));
		// because of =new = equals must be used...== will be false
		
		// equals()    equalsIgnoreCase() ..... abc vs ABS-- samae
		
		
		
		
		
		
	}
}
