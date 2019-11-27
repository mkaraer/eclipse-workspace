package day60_Collection;

import java.util.ArrayList;

import java.util.*;


public class SortedCollection {
	public static void main(String[] args) {

		List<Integer> numSet= new ArrayList<>();
		numSet.add(12);
		numSet.add(13);
		numSet.add(2);
		numSet.add(2);
		numSet.add(-20);
		
	
		Collections.sort(numSet);
		
		System.out.println(numSet);
		
		int numberOf2= Collections.frequency(numSet, 2);  //it will show how many 2 we have
		System.out.println(numberOf2);
		
		
		

	}
}
