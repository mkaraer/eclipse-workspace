package day45_2_this_isa_INHERITANCE;

public class MessageTester {
public static void main(String[] args) {
	
	MessageThis msg1=new MessageThis ("hello!","Marufjon","Akbar");
	MessageThis msg2=new MessageThis("java is fun...");
	MessageThis msg3=new MessageThis("this keyword interesting","shain");
	MessageThis msg4=new MessageThis();
	
	System.out.println(msg1.toString());
	System.out.println(msg2.toString());
	System.out.println(msg3.toString());
	System.out.println(msg4.toString());
	
	
	
}
}
