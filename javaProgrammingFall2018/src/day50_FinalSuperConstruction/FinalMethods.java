package day50_FinalSuperConstruction;

import java.util.*;

public class FinalMethods {
	public static void main(String[] args) {
		
	int[] arr= {2,34,4,57,56,87};
	
	int temp=0;
	
	
	for (int j = 0; j < arr.length; j++) 
		
	
	for (int i = 0; i < arr.length-1; i++) {
		
		if(arr[i]>arr[i+1]) {
		temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		}
	}
		
		System.out.println(Arrays.toString(arr));
		
		
		String[] str= {"ali","veli","deli"};
		String str1="";
		for (int i = 0; i < str.length; i++) {
	     System.out.print(str[i].charAt(str[i].length()-1));
		}
		
		List<String[]> str2= new ArrayList<>();
		str2.add(str);
		for(String s:str)
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	}	

}
