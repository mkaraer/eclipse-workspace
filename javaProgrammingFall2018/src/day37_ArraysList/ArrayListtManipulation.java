package day37_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListtManipulation {
public static void main(String[] args) {
	
	// creatw ArrayList fruits using 5 differnt ways
	//fruits1..
	ArrayList<String>fruits1= new ArrayList<>();
	List<String>fruits2= new ArrayList<>();
	List<String>fruits3= new ArrayList<>(10);
	ArrayList<String>fruits4= new ArrayList<>(fruits1);
	
//	List<String>fruits5= new Arrays.asList(new String[] {"watermalen","peach"});
//	   // fruits5.remove("peach"); dont work
//	List<String>fruits6= new ArrayList<>(fruits5);
//	fruits6.add("cherry");
//	
//	List<String>fruits7= new ArrayList<>(Arrays.asList(new String[] {"plum","Mango"}));
//	fruits7.add("pears");
	
	fruits1.add("grapes");
	fruits1.add("tomato");
	fruits1.add("berry");
	fruits1.add(0,"orange");
	fruits1.add(4,"strawberry");
	
	System.out.println(fruits1);
	fruits2.addAll(fruits1);
	fruits2.add("Dragon fruit");
	
	System.out.println(fruits2);
	
	fruits1.remove(0);
	System.out.println(fruits1);
	fruits1.remove("berry");
	System.out.println(fruits1);
	
	//remove all elements of fruits from fruit2  matching ones
	fruits2.removeAll(fruits1); 
	System.out.println("fruits2 "+ fruits2);
	
	fruits1.clear();
	System.out.println(fruits1);
	
	List<Integer> nums= new ArrayList<>();
	nums.add(2);
	nums.add(3);
	nums.add(3);
	nums.add(5);
	
	System.out.println(nums);// will roemove n 5 as index
	
	nums.remove(new Integer(3));
	System.out.println(nums);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
