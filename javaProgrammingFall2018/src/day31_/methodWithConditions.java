package day31_;

import java.util.Arrays;

public class methodWithConditions {
	public static void main (String[] args) {
		
	// create a method getLarger that accepts two numbers and print larger one
		// if they are equal pritn "numbers are equls" number
		//
		
		getLarger(3,2);
		int[] arr = {100,3000,40};
		getMax(arr);
		
		getMax( new int[]  {324,424,234} );
		steps(-3);
	}


public static void getLarger(int num1, int num2) {
	if(num1>num2) {
		
	System.out.println(num1);
	}else if(num2>num1) {
		System.out.println(num2);
	}else {
		System.out.println("numbers are equal "+num1);
	}
}
// create a method getMax that accept int array and print largest number in arrya
// if array is empty print "error" 

public static void getMax(int[] nums ) {
	if(nums.length==0) {
		System.out.println("Array is empty");
		return;
	}
	Arrays.sort(nums);
	System.out.println(nums[nums.length-1]);
	
}
// create method called steps it accepts an int parameter
//if the parameter is negative than we print jump that many times
//-2 jump1 jump2 
// if prameter is 0 then we sit
// if it is positivi we take steps
//steps1
//steps2
public static void steps(int num) {
	if(num==0) {
		System.out.println("sit");
		
	}else if(num>0) {
		for(int i=1; i<=num; i++) {
			System.out.println("step "+i);
			
		}
	}else if(num<0) {
		for(int n=1; n<=num*(-1); n++) {  // -5* -1---5
			System.out.println("jump "+n);
		}
		
	}
}










}
