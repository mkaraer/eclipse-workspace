package day08_conditions;
import java.util.Scanner;
public class condinional2 {
	public static void main(String[] args) {
//		English-- 1
//		Sapmish-- 2
//		Turkish-- 3
//		Russian-- 4
//		Uygur-- 5
//		Uzbek-- 6
		
		System.out.println(" Please select:\n "
			+    "English->1\n "+
				 "Spanish->2\n"+
				  "Turkish->3\n"+ 
				   "Russian->4\n"+ 
				   "Uygur->5\n" );
		Scanner scan= new Scanner(System.in);
		int language= scan.nextInt();		   
		
		
		String greeting="";
		if(language==1) {
			greeting="Hello,How are you?";
		}else if(language==2) {
			greeting="ola";
		}else if(language==3) {
			greeting= "Merhaba";
			
		}else if (language==4) {
			greeting= "previet";
		}else if (language==5) {
			greeting= "Kari";
		}else if (language==6) {
			greeting="kandeysiniz";
		
			System.out.println(greeting);
		}
		
	}
}
