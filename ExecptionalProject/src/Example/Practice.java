package Example;

public class Practice {
public static void main(String[] args) {
	
	//NullPointer // AritmaticExexption // IndexOutOfBoundException
//	System.out.println("program started");
//	String s=null;
//	System.out.println(s.length());
	
//	System.out.println(3/0);
//	
	System.out.println("the program ended");
	
//	int[] nums = {1,2,3};
	//System.out.println(nums[3]); // java.lang.ArrayIndexOutOfBoundsException: 3
	
	//String str="abc";
	//System.out.println(str.charAt(3)); // java.lang.StringIndexOutOfBoundsException: String index out of range: 3
	
	//NullPointerException npe=new NullPointerException();

	//throw npe;
	//System.out.println("the program ended");
	
	String [] str= new String[3];
	str[0]="a";
	str[1]="b";
	str[2]="c";
	
	String [] str1= new String[] {"a","b","c"};
	
	String [] str2={"a","b","c"};
	
	//System.out.println(str2[10]);
	
	//throw new ArrayIndexOutOfBoundsException();
	
	ArrayIndexOutOfBoundsException npe= new ArrayIndexOutOfBoundsException();
	throw npe;
	
	
	
}
}
