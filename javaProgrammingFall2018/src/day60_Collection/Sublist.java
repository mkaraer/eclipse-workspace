package day60_Collection;


import java.util.*;

public class Sublist {
public static void main(String[] args) {
	
	//List<Integer> lst= Arrays.asList(1,2,4,5,6,77,8,9);  you cant remove
	
//	List<Integer> lst2= new ArrayList<>();
//	lst2.add(22);
//	lst2.add(32);
//	lst2.add(12);
//	lst2.add(123);
//	lst2.add(3334);
//	lst2.add(555);
//	lst2.add(666);
//	
//	System.out.println(lst2);
//	
//	List<Integer> sub= lst2.subList(1, 4); // sub create new arraylist from 1 to 3
//	
//	System.out.println(sub);
//	
//	sub.set(2, 10000);
//	
//	System.out.println(sub);
//	System.out.println(lst2);
	
	
	/*
	 * Create list of String that have 7 elemnts
	 * 
	 * change the item from index 2-5..> ilove Collection
	 * you are required to use Sublist
	 * 
	 * then print out
	 */
	
	List<String> list= new ArrayList<>();
	
	list.add("ali");
	list.add("veli");
	list.add("deli");
	list.add("yesil");
	list.add("kirmizi");
	list.add("mavi");
	list.add("kara");
	
	System.out.println(list);
	
	List<String>sub2=list.subList(2, 6);
	System.out.println(sub2);
	
	
	for (int i = 0; i < sub2.size(); i++) {
	   sub2.set(i, "I love Collection");	
	}
	System.out.println(list);
	
	
	
	
	
}
}
