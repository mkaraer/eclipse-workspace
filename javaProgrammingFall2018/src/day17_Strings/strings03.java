package day17_Strings;

import java.util.Scanner;

public class strings03 {
	public static void main(String[] args)  {
		
		// take string contryName and abbreviate it by taking first 2 letters
		// contryName= Bangladesh-- BA , toUppercase
		
		Scanner input= new Scanner (System.in);
		System.out.println("write a country ");
		String countryName= input.nextLine();
		
		
		String abbreviated=countryName.substring(0,2).toUpperCase();
	//abbreviated=abbreviated.toUpperCase();
		 
		System.out.println(abbreviated);
		
	//ternary condition using ?and :
		//chcej if abbruviated is 2 chars:
	//if true-- 2 chars detected
	// ekse say 2 chars were not found	
		System.out.println (abbreviated.length ()==2? "2 chars detected":"chars were not found");
		
		//2 way:
		String msg1= "2 chars detected";
		String msg2= "2 chars were not found";
		String result= abbreviated.length()==2 ? msg1 :msg2;
				System.out.println(result);	
//		
				result= abbreviated.length()== 2 ? "may be usa":"not Usa";
				System.out.println(result);
				
				String ms1= "May be USA";
				String ms2= "Nor USA for sure";
				String ms3= "not";
				
		
		
		
		
		
		
		
		
		
		
		
	}
}
