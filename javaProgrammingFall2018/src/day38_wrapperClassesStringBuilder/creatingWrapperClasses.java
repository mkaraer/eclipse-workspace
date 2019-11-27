package day38_wrapperClassesStringBuilder;

public class creatingWrapperClasses {
public static void main(String[] args) {
	// create wrapper calss object
	Integer n1=new Integer(100);
	Integer n2=new Integer.valueOf(456);
	Integer n3= new Integer.paeceInt("2345");
	
	Double d1=new Double(123.45);
	Double d2= new Double.ValueOf(23.4);
	Double d3=new Double.parceDouble(12.3);
	
	Character ch1=new Character('A';);
	Character ch2=new Character.valueOf('@');
	
	char ch3='3';
	System.out.println(Character.isDigit(ch3));
	
	String str="ab5c";
	
	System.out.println(Character.isAlphabetic(str.charAt(0)));
	System.out.println(Character.isUpperCase('A'));
	System.out.println(Character.isLowerCase('m'));
	
	System.out.println(Character.isLetterOrDigit('1'));//true
	System.out.println(Character.isLetterOrDigit('@'));  //false
	
	
	
	
	
	
	
	
	
}
}
