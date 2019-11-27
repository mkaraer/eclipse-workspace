package day24_;

public class ArraysCreation {
	public static void main (String[] args) {
		
		int[] numbers= new int[5];
		
		numbers[0]=3;
		numbers[1]=4;
		numbers[3]=5123;
		numbers[4]=12;
		// int[] number= {2,4,3};
		//int[] number= new int[] {2,4,3};
		
		System.out.println(numbers[0]);
		System.out.println(numbers[3]);
		
		numbers[4]=1000;
		System.out.println(numbers[0]);
		
		//numbers[10]=1000; // index out of bonund 
		
		numbers[1]=numbers[0]+numbers[1];
		System.out.println(numbers[1]);
		//
		
		
		char[] grades = {'A','B','C','D','E'};
		char[] grades2= new char[]{'A','B','C','D','E'};
		
		System.out.println(grades[0]);
		
		
	}
}
