package Example;

public class Practice2TryCatch {
public static void main(String[] args) {
	
	
	System.out.println("program started");
	
	try {
		//dangerous action in here
		System.out.println("insade try");
		String a=null;
		System.out.println(a.length());
		
		}catch(NullPointerException e){
	
	//NullPointerException e= new NullPointerException();   //e comes from here
		System.out.println("CAOUGHT NULL An exception happened here.FISH");
		
	}catch(ArrayIndexOutOfBoundsException  e) {
		System.out.println("CAUGHT ArrayIndexOutOfBoundsException FISH");
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("Caught StringIndexOutOfBoundsException Fish");
	}
	
	
//	System.out.println("program started");
//	try {
//		System.out.println("inside the try");
//	String [] str= {"a","b","c"};
//	System.out.println(str[4]);
//	
//	
//	}catch(ArrayIndexOutOfBoundsException  e) {
//		System.out.println("An exception happened again");
//		//System.out.println(e.getMessage());
//	//	e.PrintStackTrace();
//	}
	System.out.println("program ended");
	
	
	
	
	
	
	
	
}
}
