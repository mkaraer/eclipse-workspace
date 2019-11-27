package day20_loops;

public class Accumulator {
	public static void main (String[] args) {
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum=sum+i;
			
		}
		System.out.println("sum is  "+sum);
		// writw a program to calculate bettween 1 and 5
		// 1,2,3,4,5= 15
		
//		for(int i=100; i<=500; i+=50) {
//			sum=sum+i;
	
		//100+150+200+250+...500
		
		int sumOfOdds=0;
		int sumOfEven=0;
		for(int n=0; n<=100; n++) {
			if(n%2==0) {
				//sumOfEven=sumOfEven+n;
				sumOfEven+=n;
				
			
			}else {
				sumOfOdds=sumOfOdds+n;
				System.out.println("sumOfOdds "+sumOfOdds);
				System.out.println("sumOfEven "+sumOfEven);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
