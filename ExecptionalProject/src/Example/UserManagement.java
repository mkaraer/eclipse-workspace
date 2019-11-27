package Example;

import java.awt.List;
import java.util.*;

public class UserManagement {
public static void main(String[] args) {
	UserManagement c= new UserManagement();
	
	createUserName("6 Ibrahin cybertek");
	//createUserName("ib");
	//String str=null;
	//createUserName(str);
	
}	
public static void 	createUserName(String name) {
	try {
	System.out.println(name.charAt(0));
	System.out.println(name.charAt(9));
	
	char[] nameChars=name.toCharArray();
	System.out.println(nameChars[9]);
	
	String[] arrName= name.split(" ");
	Integer i=Integer.parseInt(arrName[0]);
	System.out.println(i);
	
	throw new Exception();
	
	}catch(NullPointerException | ArrayIndexOutOfBoundsException |
			StringIndexOutOfBoundsException e) {
		System.out.println("caought  out of bound exception");
	}catch(Exception e) {
		System.out.println("caught exception");
	}finally {
		System.out.println("final");
	}
//	
	
}	
	
	
	
	
	
	

}
