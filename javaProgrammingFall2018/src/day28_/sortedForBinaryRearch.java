package day28_;

import java.util.Arrays;

public class sortedForBinaryRearch {
	public static void main (String[] args) {
		
		String []words= {"cake","tomato","wooden spoon","pizza"};
		
		
	
		System.out.println(Arrays.toString(words));  //fisrt sort it
		
		System.out.println(Arrays.binarySearch(words,"tomato")); // find the location of index of pizza
		
		//without binarySearch how can be found index of tomato
		
		int index=0;
	for(int i=0; i<words.length; i++) {
		if(words[1].equals("tomato")) {
			index=i;
			break;
		}
	}
		
	System.out.println(index);
		
		
		
		
		
		
		
		
	}
}
