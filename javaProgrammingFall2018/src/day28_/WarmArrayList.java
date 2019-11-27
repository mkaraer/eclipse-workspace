package day28_;

import java.util.Arrays;

public class WarmArrayList {
	public static void main(String[] args) {
	
		int[] ints1= {2,3,4};
		int[] ints2= {4,5,6};
		System.out.println(Arrays.toString(addElement(ints1,ints2)));
		
		
	}
	
	public static int[] addElement(int[]ints1 , int[] ints2){
		
		int[]newArray= new int[ints1.length];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i]=ints1[i]+ints2[i];
			
		}
		return newArray;
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
