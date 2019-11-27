package day45_static_block_INHERITANCE;

public class ClassWithINITbloc {
	static{
		System.out.println("static bloc. i run before custructor after object creation only one time");
	}
	
	{
		System.out.println("this is initialzer block.i run everytime object is created");
	}
public ClassWithINITbloc() {
	System.out.println("this is constructer. it run everytimes objects is created");
}
	public static void staticMethod() {
		System.out.println("ststic method");
	}
	
	
	
	
	
	
	
	
	
	
}
