
package day25_Arrays;

import java.util.Random;
import java.util.Scanner;

public class largeNumberinArrayRandom {
	public static void main (String[] args) {
	
	Scanner input=new Scanner(System.in);
	Random random=new Random();

	System.out.println("how many items in Array?");
	int count= input.nextInt();
	
	int[]nums= new int[count];
	
	for(int i=0; i<count; i++) {
		nums[i]=random.nextInt(100);
	}
	int smallest=nums[0];
	for(int n:nums) {
		if(n<smallest) {
			smallest=n;
		}
	System.out.print(n+" ,");
	
	}
	
	System.out.println("smallest"+smallest);
//	
	}
}
