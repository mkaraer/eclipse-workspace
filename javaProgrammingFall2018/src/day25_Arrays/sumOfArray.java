package day25_Arrays;

public class sumOfArray {
	public static void main (String[] args) {
		//craete veriable nums assign values 
		// using a loop calculate the sum and print it
		// 
		
		
//		
//		int[] nums= {3,5,9,100};
//		int sum=0;
//		int sumOfOdds=0
//		
//		for(int n:nums) {
//			sum=sum+n; //sum+=n
//		}
//		System.out.print("sum is "+sum);
		
		int[] nums= {3,5,9,100};
		int sum=0;
		int sumOfOdds=0;
		int sumOfEven=0;
		
		for(int n:nums) {
		if(	n%2==0);
		sumOfEven+=n;
		
		}else {
			sumOfOdds+=n;
		}
	
		System.out.print(sumOfEven);
		
		
		
		
		
		
	}
}
