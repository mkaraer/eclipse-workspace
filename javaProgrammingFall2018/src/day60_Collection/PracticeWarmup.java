package day60_Collection;

import java.util.*;

public class PracticeWarmup {
public static void main(String[] args) {
	
	
	List<String> list= new ArrayList<>();
	
	list.add("A");
	list.add("A");
	list.add("z");
	list.add("b");
	list.add("B");
	list.add("9");

	
	//System.out.println(list.subList(2, 5));
	//	System.out.println(list);
	Set<String> set= new HashSet<>(list);
	
	System.out.println(set);
	System.out.println(set.size());
	
	
	SortedSet<String> sort=new TreeSet<>(list);
	System.out.println(sort);
	System.out.println(sort.subSet("A", "B"));
	System.out.println(sort.first());
	sort.last();
	
//	
//	for (int i = 0; i < list.size(); i++) {
//		set.add(list.get(i));
//	}
//  System.out.println(set.size());
	
	// set.addAll(list); //2.way
	// System.out.println(set.size());
	
	//List<String> list2= new ArrayList<>(list);
	
	
	
//	
//	System.out.println(set.size());
//	
//	Iterator<String>my= list.iterator();
////	
//	while(my.hasNext()) {
////		
//			
//	}
//	System.out.println();

	
	
}
}
