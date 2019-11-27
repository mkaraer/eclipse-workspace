package day10_conditions4;

public class findASeason {
	public static void main(String[] args) {
		
//1. Find a season
//		mont==number and find the season of the year for that month Number.class2.
//				Leap year(February 20 days)
//				if an year is 1 multiple of 400 or
//				2 multiple of 4 but not multiple of 100 then its leap year.
//		
		
		int month=5;
////		spring= 3-5
//		summer= 6-8
//		fall= 9-11
//		winter= 12or1-2
		
//	String season= "";
//		String monthOfTheYear= "january,february,march,june,july,august,september,october,november,december";
		
		
		
		if(month==12|| month==1|| month== 2) {
			System.out.println("winter");
		}else if(month>3&& month<=5) {
			System.out.println("spring");
		}else if(month>6&& month<=8) {
			System.out.println("summer");
		}else if(month>9&& month<=11) {
			System.out.println("fall");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
