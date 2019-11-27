package day60_Collection;

import java.util.HashSet;
import java.util.*;


public class PracticeSet {




public static void main(String[] args) {
	
	SortedSet<String>list=new TreeSet<>();
	list.add("A");
	list.add("z");
	list.add("b");
	list.add("B");
	list.add("");
	list.add("9");

	System.out.println(list);
	
	System.out.println(list.subSet("9", "z"));  //sorts and according ascii number from 9 to z
	System.out.println(list.subSet("8", "}"));
	
	System.out.println(list.headSet("B")); // prints after B
	System.out.println(list.tailSet("B"));  //prints before B
	
	
	
	
	
	
	
	
	
	
}
}
