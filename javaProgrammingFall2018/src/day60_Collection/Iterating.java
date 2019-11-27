package day60_Collection;


import java.util.*;

public class Iterating {


public static void main(String[] args) {
	
//	List <Integer> lst= new ArrayList<>();
//	
//	lst.add(12);
//	lst.add(15);
//	lst.add(20);
//	
//	Iterator<Integer> myIterator= lst.iterator();
//	System.out.println(myIterator.next());
//	System.out.println(myIterator.next());
//	System.out.println(myIterator.next());
//	
//	System.out.println(myIterator.hasNext());
//	
//	while(myIterator.hasNext()) {
//		
//		int myNum=myIterator.next();
//		if(myNum>16) {
//			myIterator.remove();
//		}
//		
//		
//	}
//	System.out.println(lst);
	
/*Create LinkedList of String
 * add 4 elenments
 * iterate over using Iterator
 * romove the elemnt
 * 	if elemnt contains letter A and Z
 */
	List<String> str= new LinkedList<>();
	str.add("Aali");
	str.add("veli");
	str.add("selm");
	str.add("HilalZ");
	
//	for (String string : str) {       //can not remove element while iterating using loops..
//		if(string.contains("A")&&string.contains("Z")) {
//			str.remove(string);
//		}
//	}
//	System.out.println(str);
	
	Iterator<String> myIterator= str.iterator();
	
	
	
     while(myIterator.hasNext()) {
		
    	 String st=myIterator.next();
		if(st.contains("A")&&st.contains("Z")) {
			myIterator.remove();
		}
		
	}
	System.out.println(myIterator);
	
	
	

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
