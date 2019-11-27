package day45_static_block_INHERITANCE;

public class classWithInitBlock {
	{
		System.out.println("this is initilizer block. i run automaticly.");
		
	}
	static {
		System.out.println("static block. i run only omce");
	}
	public classWithInitBlock() {
		System.out.println("this is a constructor. i run evertime object is created.");
	}
	public static void staticMethod () {
		System.out.println("static method");
	}
}
