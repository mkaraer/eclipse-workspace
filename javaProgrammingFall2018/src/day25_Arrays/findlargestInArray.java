package day25_Arrays;

import java.util.Scanner;

public class findlargestInArray {
	public static void main (String[] args) {
		//from ask user to enter how many items in array
		Scanner input=new Scanner(System.in);
		
		System.out.print("how many items in array?");
		
		int count=input.nextInt();
		
		// create array called nums with that capasity of 
		int[] nums= new int[count]; 
		System.out.println(nums[0]);
		
		//using a loop enter values one by one
		
		for(int i=0; i<count; i++) {
			System.out.print("Enter the nember ");
			nums[i]=input.nextInt();
		}
		//print all items lines using for each loop
		for(int n:nums) {
			System.out.print(n+" ");
		}
		System.out.println();
		// iterate in array and find the largest number
		
		 int largest= nums[0];
		 
		 for(int num: nums) {
			 if(num>largest) {
				largest=num;
			 }
			 
		 }
		 System.out.print("largest number"+largest);
	}
}
