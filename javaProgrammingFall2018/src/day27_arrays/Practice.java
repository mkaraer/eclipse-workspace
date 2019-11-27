package day27_arrays;

import java.util.Arrays;

public class Practice {
	public static void main (String[] args) {
		
		int [] nums= {12,32,324,34554,54,646,6,4,64,64,4646,456};
		
		for(int i=0; i<nums.length; i++) {
			
			for(int j=0; j<nums.length-1; j++) {
				
				if(nums[j]<nums[j+1]) {
					int t=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=t;
				}
			}
			
		}
		System.out.println(Arrays.toString(nums));
		
		
		
		
		
		
		
		
		
	}
}
