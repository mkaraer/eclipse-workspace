package day36_ArraysList;

import java.util.ArrayList;

public class StringOnlyArrayList {
	public static void main(String[] args) {
	//	--METHOS=ARRAYLIST===
		// how to add a value to an arraylist
		     // add method:
		   //list.add("valueu");
		// how to get count of elememt
		// size() method
		  // how to reS  vLUE t a particular index?
		    // get(index) method
		// to get rif of element---- list.remove
		  // how to print in a formatted way in single line
		// System.out.println(list);
		// System.out.println(list.toString());
		
		//ArrayList<String> names;
		//names=new ArrayList<>();
		
		// How to use with PRIMITIVIES:
		// ArrayList<int> nums= new ArrayList<>(); ---doesntWORK!!!
		//ARRAYLIST dont have Primitivs, it can only objectevs
		
		// to handle this sort of stituation, in java we have WRAPPER classes in top pf primitives.
		// THEY help you tp create an object from primitivies.
		      //byte==byte
//		       short==short
//				int=integer
//				long=long
//				float=floar
//				double=double
//				char=character
//				booleam=boolean
		//===ArrayList<int>nums = new ArrayList<>();== NOT WORK
		// INSTEAD
		//ArrayList<integer>nums = new ArrayList<>();  == WRAPPED CLASSES
		
		
		
		ArrayList<String> names= new ArrayList<>();
		
		names.add("Ali");
		names.add("Sevket");
		names.add("Khalili");
		names.add("Z");
		
		//print all in same line
		System.out.println(names);
		names.add("james");
		System.out.println(names);
		
		//get size
		System.out.println(names.size());
		
		int length=names.size();
		System.out.println("number of names "+length);
		
		//read first name
		String first=names.get(0);
		System.out.println(first);
		//or
		System.out.println(names.get(0));
		
		String last= names.get(names.size()-1);
		System.out.println("last: "+last);
		
		//remove element from thelist
		
		names.remove(0);
		System.out.println(names);
		
		//names.remove(2);
		names.remove("Z");
		
		names.set(names.indexOf("james"), "hilal");
		System.out.println(names);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(names);
		
		
		
		
		
	}

}
