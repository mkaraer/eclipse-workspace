package day33_methodwithReturn;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
public static void main(String[] args) {
	

	// method name: getIntArray5
	//Params:/Args: nothing
	//return: int Array
	
	// create an array with 5 int and assign random numbers,
	//between 0-100 thenreturns that array
	
//	 int[] nums = new int[5];
//	 Random rdm =new Random();
//     
//	 for(int i=0; i<nums.length; i++) {
//		 nums[i]=rdm.nextInt(101);
//		 System.out.println(Arrays.toString(nums));

	
	// call array method
	
	   int [] myNums =getIntArray5();
	   System.out.println(Arrays.toString(myNums));
	   
	 
	   int[]nums1=getIntArray5();
	   int[]nums2= getIntArray5();

	   int sumOfNums1=0,sumOfNums2=0;

	   for(num:nums1) {
	   	sumOfNums1+=num;
	   }

	   for(num:nums2) {
	   	sumOfNums2+=num;
	   }
	   if(sumOfNums1>sumOfNums2) {
	   	System.out.println("First Array is Larger"+sumOfNums1);
	   	System.out.println("First Array is Larger"+sumOfNums2);

	   }else if (sumOfNums2>sumOfNums1) {
	   	System.out.println("Second Array is Larger"+sumOfNums2);
	   	System.out.println("Second Array is Larger"+sumOfNums1);
	   	
	   }else {
		   System.out.println("Sum of Array is equal"+sumOfNums1);
		   System.out.println("sum Array is equal"+sumOfNums2);
	   }


	
}
	
public static int[] getIntArray5() { 
	 int[] nums = new int[5];
	 Random rdm =new Random();
     
	 for(int i=0; i<nums.length; i++) {
		 nums[i]=rdm.nextInt(101);
	 
	 }
	 return nums;
}


//	 System.out.println(Arrays.toString(nums));
//	//2 way
//	 int[] nums2= {rdm.nextInt(101),rdm.nextInt(101),rdm.nextInt(101),rdm.nextInt(101),rdm.nextInt(101)};
//	System.out.println(Arrays.toString(nums2));
	



// create 2 arrays using getIntArray5
//compare SUMS of both and pritn out wich one is larger

//public static inr[] getIntArray5(int[] nums1, int[] nums2);


int[]nums1=getIntArray5();
int[]nums2= getIntArray5();

int sumOfNums1,sumOfNums2;


for(num:nums1) {
	sumOfNums1+=num;
}

for(num:nums2) {
	sumOfNums2+=num;
}
if(sumOfNums1>sumOfNums2) {
	System.out.println("First Array is Larger"+sumOfNums1);
	System.out.println("First Array is Larger"+sumOfNums2);

}else if if(sumOfNums2>sumOfNums1) {
	System.out.println("Second Array is Larger"+sumOfNums2);
	System.out.println("Second Array is Larger"+sumOfNums1);
	
}

















	
	
	
	
	
	
}
