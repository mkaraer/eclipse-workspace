package day38_wrapperClassesStringBuilder;

import java.util.*;

public class ConvertingStringsToPrimitivies {
public static void main(String[] args) {
	
	String count="432";
	
	int iCount=Integer.parseInt(count); //convert string to int
	System.out.println(iCount);
	
	if(iCount>0) {
		System.out.println("count is posotive");
		
	}else {
		System.out.println("count is negative");
	}
	
	String str= "price is 45.77";
	
	String[] sp=str.split(" ");
	double price =Double.parseDouble(sp[2]);
	
	// need to get only the number??                      //pardeInt method -- returrns a primitive value
	                                                      // valueOf returns a wrapper calss object
	System.out.println(price);
	
	String etsyResult="wooden spoon (13,950)";
	
	
	String[] etsyArray=etsyResult.split(" ");
	String strSpoonCount=etsyArray[2].replace("(", "").replace(",", "");
	
	
	int woodenSpoons= Integer.parseInt(strSpoonCount); // converts
	if (woodenSpoons>0) {
		System.out.println("Passs. ");
	}else {
		System.out.println("Fail");
	}
	System.out.println(woodenSpoons);

	
	
	
	
	
	
	
	
	
	
	
	

}
}
