package day28_;

import java.util.Arrays;

public class splitEmail {
	public static void main (String[] args) {
		//given a string variable email, write code using split
		//medot to print email id and domain in separate inlines
		//examples
//		email: info@cbertekschool.com
//		print
//		email id: info
//		email domain: cybertekschool.ocm

		String email ="info@cbertekschool.com";
		
		String[] splitted= email.split("@");
		
		System.out.println(splitted.length);  // will give how many array(2)
		
		if(splitted.length==2) {
		System.out.println("email id: "+ splitted[0]);  // print-- info
		System.out.println("email domain: " + splitted[1]);
		
		}else {
			System.out.println("invalid email");
		}
		String str= "today is sunday";
		String[] arr=str.split("s");
		System.out.println(arr[0]);  // today is
		System.out.println(arr[1]);   // urday
		
		
		
		}
	String email ="metin@gmail.com";
		String[] mail=email.split("@");
		
		if(mail.length==2) {
			System.out.println("id: "+mail[0]);
			System.out.println("email domain: " +email);
		}
		System.out.println(Arrays.toString(mail));
		System.out.println(mail.length);
		System.out.println(mail[0]);
		System.out.println(mail[1]);
		
		
		
		
	}
}
}