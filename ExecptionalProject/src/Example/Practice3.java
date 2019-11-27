package Example;

public class Practice3 {
public static void main(String[] args) {
	
System.out.println("program started");
	
	try {
		//dangerous action in here
		System.out.println("insade try");
		String a="asdfrtg";
		System.out.println(a.charAt(5));
		System.exit(0); // shut down below willnot printed..
		
		}catch(NullPointerException | ArrayIndexOutOfBoundsException |StringIndexOutOfBoundsException e){  //istead of using many -catch- use-|-
	
	   System.out.println("caought exception FISH");
		System.out.println(e.getClass());
	     
	}finally {
		System.out.println("program came to finally block");
	}
	
	System.out.println("program ended");
	
	
	//Finally keyboard is like switch statement
	//it will run no matter if you have exception or not
	
	
	
	
}
}
