package day60_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetPractice {
	public static void main(String[] args) {

		SortedSet<Integer> numSet = new TreeSet<>();

		numSet.add(12);
		numSet.add(13);
		numSet.add(100);
		numSet.add(16);
		numSet.add(-12);
		
		System.out.println(numSet);
		
		for (Integer each : numSet) {
		System.out.println(each);	
		
		}
/*
 * Create a String of TreeSet and 6 items\
 * with dublicate
 * try to iterate over using for loop
 * and iterate
 */
		SortedSet<String> list= new TreeSet<>();
		
		list.add("kara");
		list.add("veli");
		list.add("veli");
		list.add("yesil");
		list.add("kirmizi");
		list.add("mavi");
		list.add("kara");
		
		System.out.println(list);	
		
		SortedSet<String>tail=list.tailSet("veli"); //...>will print out after veli
		System.out.println(tail);
		SortedSet<String>head=list.headSet("kirmizi"); //.. will print before kirmizi
		
		
		Iterator<String> myIt=list.iterator();
		
		while(myIt.hasNext()) {
			System.out.println(myIt.next());
		}
		
		
		
		
		
		
		
		
		
	}
}
