package Example;

public class TryCatchFinallyGeneralBlock {
public static void main(String[] args) {
	
	//Multi try catch block order
	// the more specific type (sub class type) should be used first in catch block
	//and nore general type(super calss type) should be used after.
	
	try {
		Thread.sleep(1000);
		System.out.println("abc".charAt(10));// String Indexoutofboundexc
		
		
	}catch(InterruptedException e) {
		System.out.println("InterruptedException");
		
	}catch(Exception e) {
		System.out.println("any other type of exception"); // this is general and catch all exceptions
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
