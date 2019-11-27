package day14_;

import java.util.Scanner;

public class statingtheObvious {
	
	public static void main(String[] args)  {
	// what is your email
		// some@gmail
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter your email");
		
		String entry= scan.nextLine();	
		
int start= entry.indexOf("@")+1;  // add 1 == 10 olacak asaginin tersine

System.out.println(start);// index 9 numarayi soyluyor
System.out.println(entry.substring(start)); // @gmail.com @ den sonrasini gosteriyor

	int end= entry.indexOf(".");
	
	System.out.println("oh so you have a "+entry.substring(start, end)); //oh so you have a gmail
	
	
	
	
	}
}
