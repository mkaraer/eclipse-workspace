package day26_;

public class ArrayUnique {
	public static void main (String[] args) {
		// take anumber from array
		//compare with the rest of numbers in the array. if no matches found
		// it is unique and print it
		
		//take a number from array
		//create a varible conter and assign zero 
		//compare the number with all other numbers
		//if a match found counter++ , if not dont touch counter
		
		int[] nums= {1,2,3,4,2,3,4,44,12,20,100,33,100,4};
	//for(int outer=0; outer<nums.length; outer++) {
//			int currentNum=nums[outer];
//			boolean dublicate=false;
//			
//			for(int inner=0; inner<nums.length; inner++) {
//				if(nums[inner]==nums[outer]&& outer!=inner) {
//					dublicate=true;
//					
//				}
//				}
//			if(dublicate==false)
//			System.out.print(currentNum+" ");
//		}
		 
	for(int outer=0; outer<nums.length; outer++) {
		int currentNum=nums[outer];
		boolean unique=true;
		
		for(int inner=0; inner<nums.length; inner++) {
		if(nums[outer]==nums[inner]&& outer!=inner) {
			unique=false;
		}
	}
		if(unique==true)
			System.out.print(currentNum+" ");
		
		int sum=0;
		
		for(int n:nums) {
			if(n>sum) {
				sum+=n;
			}
		}
		System.out.println("largest" +sum);	
	}
	
	
		
		
		
		
	}
}
