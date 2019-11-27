package day37_ArraysList;

import java.util.ArrayList;

public class WrapperClasses {

	public static void main(String[] args) {
		System.out.println("min Byte "+Byte.MIN_VALUE);
		System.out.println("Max Byte "+ Byte.MAX_VALUE);
		
		System.out.println("min Short "+Short.MIN_VALUE);
		System.out.println("Max Short "+ Short.MAX_VALUE);
		
		System.out.println("min Int "+Byte.MIN_VALUE);
		System.out.println("Max Byte "+ Byte.MAX_VALUE);
		
		System.out.println("min Float "+Float.MIN_VALUE);
		System.out.println("Max Float "+ Float.MAX_VALUE);
		
		System.out.println("min Double "+Double.MIN_VALUE);
		System.out.println("Max Double "+ Double.MAX_VALUE);
		
		System.out.println("min Char "+Character.MIN_VALUE);
		System.out.println("Max Char "+ Character.MAX_VALUE);
		
		String[]snums= {"3","5"};
		ArrayList<Integer>list1=new ArrayList<>();
		for(String num:snums) {
		list1.add(Integer.valueOf(num));
		
	}
	System.out.println(list1);
}
}