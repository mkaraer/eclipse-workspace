package day60_Collection;

import java.util.*;

public class SetPractice {
public static void main(String[] args) {
	
	Set<Integer> numSet= new HashSet<>();  // work with multible window and tap
	                                       // dublicated elemnt will remove [16, 12, 13]
	numSet.add(12);
	numSet.add(13);
	numSet.add(13);
	numSet.add(16);
	numSet.add(12);
	
	System.out.println(numSet);
	
	for (Integer each : numSet) {
	System.out.println(each);	
	
	}
	Iterator<Integer> myIt= numSet.iterator();
	
	while(myIt.hasNext()) {
		Integer target=myIt.next();
		System.out.println(numSet.toString());
		}
	System.out.println(numSet.toString());
	
	
	
	
}
}
