package day25_Arrays;

public class findsmallerArrayss {
	public static void main (String[] args) {
		// create array nums assign several values
		// print the smallest value in array
		
		int[] nums= {3,7,950};
		
		int smallest = nums[0];
		
		for(int num:nums) {
			if(num<smallest) {
        smallest=num;
        
			}
		}
		
		System.out.print("smallest number"+smallest);
		
		
		
		
		
		
		
		
	}
}
