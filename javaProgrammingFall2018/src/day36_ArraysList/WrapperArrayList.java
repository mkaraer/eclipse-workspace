package day36_ArraysList;

import java.util.ArrayList;

public class WrapperArrayList {
	public static void main(String[] args) {
		
		Integer n=100;
		ArrayList<Integer>nums = new ArrayList<>();
		nums.add(300);
		nums.add(500);
		nums.add(1234);
		nums.add(654);
		System.out.println(nums);
		System.out.println(nums.toString());
		
		//for each loop
		for(Integer num:nums) {
			System.out.println(num);
		}
	System.out.println("------------------------");	
		for(int num:nums) {
			System.out.println(num);
		}
		// for loop
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
			
		}
		
		
		
		
	}

}
