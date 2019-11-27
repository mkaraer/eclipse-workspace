package day37_ArraysList;

import java.util.*;

public class MethodWithArrayList {
public static void main(String[] args) {
	
	//how to write that accepts an Arraylist
	List<Integer> nums= new ArrayList<>();
	nums.add(1000);
	nums.add(4000);
	nums.add(10000);
	  int result= sumList(nums);
	System.out.println(sumList(nums));
	List<Integer> myNums1= new ArrayList<>();
	myNums1.add(100);
	myNums1.add(400);
	myNums1.add(1000);
	
	List<Integer> myNums2= new ArrayList<>(myNums1);
	
	myNums2.add(543);
	myNums2.add(10);
	
	System.out.println(sum2List(myNums1,myNums2));
	
	System.out.println(bulidInList(500));
	List<Integer>randomList= bulidInList(500);
	System.out.println(randomList);
	
	//System.out.println(buildInc(500));
	
	List<Integer>time=new ArrayList<>();
	 time.add(3);
	 time.add(9);
	 time.add(2);
	 System.out.println(twoTimes(time));
	
}
	public static int sumList(List<Integer> nums) {
	
		int sum=0;
		for(int n:nums) {
			sum+=n;
		}
	for (int i = 0; i < nums.size(); i++) {
		    sum+=nums.get(i);
		
	}
	
		
		return sum;
	}
	
	/*
	 * Method: sum2List
	 * Args: 2 integer ArrayList
	 * return type: int
	 * Sum of both ArrayList
	 */
	
	public static int sum2List(List<Integer> myNums1,List<Integer> myNums2) {
		
	int sum=0;
	for (Integer num : myNums1) {
		sum+=num;
	}
		
	for (Integer num : myNums2) {
		sum+=num;
	}
	return sum;
	
	}
	
	/*
	 * how to write a method taht returns an arraylist of integers
	 * 
	 * method name: bulidinList
	 * return type: arraylist of integer
	 * arg: int
	 * 
	 * this method gets an int and creates an arraylist with that random 
	 * numbrs betwwen 0-100 and returns it
	 * 
	 */
	public static List<Integer> bulidInList(int count) {
		
		Random random=new Random();
		List<Integer> returnList=new ArrayList<>();
	  
	  
	  for (int i = 1; i <= count; i++) {
		  returnList.add(random.nextInt(101));
	}
	  
	return returnList;	
		
	}
	// double parametrs
public static List<Integer> twoTimes (List<Integer> time)	{
	List<Integer> twice=new ArrayList<>();
	
	for(Integer t:time) {
	twice.add(t*2);
	}
	
	 
//	for (int j = 0; j < time.size(); j++) {
//	word.set(j,word.get(j)*2);	
//	}
	return twice;
}
	
	
	
	
	
	
}

