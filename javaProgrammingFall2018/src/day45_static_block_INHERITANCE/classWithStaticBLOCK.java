package day45_static_block_INHERITANCE;

public class classWithStaticBLOCK {

	static {
		System.out.println(("this is a STATIC BLOCK. i run once inthe beginning"));
	}
	public classWithStaticBLOCK() {
		System.out.println("This is a Cosstructer. I run every time object is created.");
	}
	public static void staticMethod() {
		System.out.println("This is static method");
	}
}





// purpose block: if you have staic varibales ,list,array etc. that need to be initioalzed one time. 
//we can use static block to do it.
// i recently use this block toconnect to database before any toher code execution.