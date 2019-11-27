package day28_;

import java.util.Arrays;

public class ArraySort {
	public static void main (String[] args) {
		// sort method of arrays class
		
		int[] nums = {9,4,3,0,-4,5,3,10};
		
		for (int n:nums) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		
		Arrays.sort(nums);
		
		for (int n:nums) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		String[] names= {"Said","John","Asel","Alisiya","Mijat","Tariq","z"};
		
		Arrays.sort(names);  // Arrays.sort(names,2,5); --- it will sort between 2 and 4
		for(String b:names) {
			System.out.print(b);
		}
		System.out.println();
		
		char[] charArray= {'c','C','D','A','2'};
		
		Arrays.sort(charArray);
		
		for(char k:charArray) {
			System.out.print(k+" ");  // 2 A C D c  --uppercase is larger than lowercase
		}
	String arrayData= "[13.45,4.2,45.50,0.99]";
	//..you can use string manipulation methods to convert back to array
	// get rid of '['and']'
	//splitby ","
	
char[] charArray1= {'c','C','D','A','2'};
		
		Arrays.sort(charArray1,0,3); // 0-3 arasi sort rest is not sorted...
		
		for(char k:charArray1) {
			System.out.print(k+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
