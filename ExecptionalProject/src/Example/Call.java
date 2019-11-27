package Example;

public class Call {
public static void main(String[] args) {
	callJohn();
	
}
public static void callJohn() {
	System.out.println("call started");
	try {
		callHalil();
	} catch (InterruptedException e) {
		System.out.println("got checked exception");
	}
	System.out.println("call ended");
	
}
public static void callHalil() throws InterruptedException{
	System.out.println("method call Halil");
	
//	try {
//		throw new RuntimeException("halil is too busy");	
//	} catch (Exception e) {
//		System.out.println("we got Halil");
//	}
	
}


















}
