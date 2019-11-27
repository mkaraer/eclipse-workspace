package draw;

import java.util.*;

public class exer {
public static void main(String[] args) {
	
	// declarin veriable-- String name 
			// veriable nameis name and type is String 
			// hey java i want you to create a verible called name that String object
			//2. assihn object= String object. anything in double quotes is String object that value
	
	
	String domain="@cybertech.com";
	Scanner input=new Scanner(System.in);
	System.out.println("enter your user name");
	String name= input.next();
	
	System.out.println("this is your new email");

	System.out.println(name.concat(domain));
	
	
	
}
}
