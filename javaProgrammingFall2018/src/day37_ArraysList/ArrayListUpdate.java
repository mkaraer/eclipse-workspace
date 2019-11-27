package day37_ArraysList;

import java.util.*;

public class ArrayListUpdate {
public static void main(String[] args) {
	
List<Integer> nums= new ArrayList<>();
nums.add(100);
nums.add(200);
nums.add(300);
nums.add(400);
nums.add(500);

System.out.println(nums);
//update 100 with 1000
nums.set(0, 1000);	
	System.out.println(nums);
	
	// double value of index 1
	nums.set(1, nums.get(1)*2);
	System.out.println(nums);
	
	// find the postition 300 make it 3
	
	nums.indexOf(300);
	System.out.println(nums.indexOf(300));
	
	nums.set(2, 3);
	System.out.println(nums);
	
	nums.set(nums.indexOf(500), 39);
	System.out.println(nums);
	
	
	
	
	
	
	
	
	
	
}
}
