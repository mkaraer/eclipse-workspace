package day53_AbstractionInterface;

public interface Drawable {
	public static final String COLOR="green";
	
	public abstract void draw();
	public abstract int drawLine(String s);
	
	public default void drawSquare() {
		System.out.println("make implimentation");
	}
	public static void doStaticStuff() {
		System.out.println("it is static");
	}
	
	
}
