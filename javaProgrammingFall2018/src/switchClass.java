
import java.util.Scanner;
public class switchClass {
	public static void main(String[] args) {
		
		int day=1;
		String classAtSchool= "Group Project";
		String WeekdayName= "Monday";
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the day");
		
		Scanner scan = new Scanner(System.in);
	    
		String classAtSchool = "", WeekdayName = "" ;
	   
	    if (day==1) {
	    	WeekdayName="monday";
	    	classAtSchool="Group Project";
	    }else if (day==2) {
	    	WeekdayName="Tuesday";
	    	classAtSchool="java";
	    }else if (day==3) {
	    	WeekdayName="wednesday";
	    	classAtSchool="java";
	    }else if (day==4) {
	    	WeekdayName="thursday";
	    	classAtSchool="manual..";
	    }else if (day==5) {
	    	WeekdayName="friday";
	    	classAtSchool="no class";
	    }else if (day==6) {
	    	WeekdayName="saturday";
	    	classAtSchool="java";
	    }else {
	    	System.out.println("eror");
	    }
	    System.out.println("day of week"+ WeekdayName);
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
