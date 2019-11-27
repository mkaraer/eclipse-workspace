import java.util.Scanner;

public class yearAgeMonthChildren {
	public static void main(String[] args)  {
		
		Scanner input= new Scanner (System.in);
	System.out.println("Enter month; ");
	double months= input.nextDouble();
	
	if(months<=0.0) {
		System.out.println("not born yet; ");
	return;
	}
	
	int year= (int) (months/12);
	int remainingMonths=(int)(months%12);
	String ageGroup="";
	
	if(months<1.0) {
		ageGroup="Neoante";
		System.out.println("weeks old" +(months/0.25));
	}else if(year<1) {
		ageGroup="Infant";
		System.out.println("months "+months);
	}else if(year<13){
		if(year<3) {
			ageGroup="Todler";
		}else if(year<6) {
			ageGroup="Pre-School";
		}else {
			ageGroup="School Age Child ";
		}
		
	}else if (year<65) {
		if (year<19) {
			ageGroup="Adolescent";
		}else if(year<41) {
			ageGroup="young adult";
		}else {
			ageGroup="middle age ";
		}
	}else {
		ageGroup= "Older Adult";
	}
	
	
	System.out.println("age group: "+ ageGroup);
	System.out.println("Years: "+ year);	
	System.out.println("Months: "+ remainingMonths);
	
	
  
 
  
    		
    	
  
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}