package Example;

import java.io.FileNotFoundException;

public class CheckedException {
public static void main(String[] args) {
	
//FileNotFoundException
	//Unchecked Exception..>we dont have to handle at compile time.
	 // anything that IS_A runtimeExceotion can be called as Uncheked exception
	
	//checked exception..>we have to handle at compile time or it will not compile
	//anything is taht IS-A exception
	// but not is a runtime exception
	
	FileNotFoundException e=new FileNotFoundException();
	System.out.println("ABC");
	
	
	try {
		System.out.println("dangerous action");
		throw e;
		
	}catch(FileNotFoundException e1) {
		System.out.println("handle the exception");
	}
	
	
	
	
	
	
	
	
	
	
}
}
