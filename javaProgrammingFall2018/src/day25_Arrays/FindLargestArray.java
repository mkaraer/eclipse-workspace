package day25_Arrays;
import java.util.Scanner;
public class FindLargestArray {
	public static void main (String[] args) {
	//from ask user to enter how many items in array
			Scanner input=new Scanner(System.in);
			
			System.out.println("how many items in array?");
			
//			int count=input.nextInt();
//			// create array called nums with that capasity of 
//			
//			int[] nums= new int[count]; 
//			
//			System.out.println(nums[0]);
//			//using a loop enter values one by one
//			for(int i=0; i<count; i++) {
//				System.out.println("enter number"+(i+1));
//				nums[i]=input.nextInt();
//			}
//
//        for(int n : nums) {
//        	System.out.print(n+" ");
//        }
//        System.out.println();
//
//       for(int )

			int count= input.nextInt();
			int[] nums= new int[count];
			
			for(int i=0; i<count; i++) {
				System.out.println("enter number"+(i+1));
				nums[i]=input.nextInt();
			}
          for(int n:nums) {
        	  System.out.print(n+" ");
        	  
				
          }
          System.out.println();
          
			
			
			
}
}