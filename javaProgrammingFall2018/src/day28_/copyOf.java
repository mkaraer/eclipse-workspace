package day28_;

import java.util.Arrays;

public class copyOf {
	public static void main (String[] args) {
		
		int[]a= {10,20,30};
		int[]b=Arrays.copyOf(a, 2); // copy 2 items from a
		
		System.out.println(Arrays.toString(b));
		
		int[]c=Arrays.copyOf(a, 5);
		
		
		System.out.println("------------------------");
		
		a=Arrays.copyOf(a, 4);
		System.out.println(Arrays.toString(a));
		
		a[3]=100;   // adding 100 to a
		System.out.println(Arrays.toString(a));
		
		char[]charr = {'#','%','*','@'};
		//copy whole array into newarr
		char[] newarr= Arrays.copyOf(charr, 4);
		char[] newarr1= Arrays.copyOf(charr, 2); // first 2 items
		char[] newarr2= Arrays.copyOf(charr, 6);  // copy everthing and put additional '',''
		char[] newarr3= Arrays.copyOf(charr, charr.length+2);  // put everything back and add 2 more
		
		
		System.out.println(Arrays.toString(newarr3));
		
		
		
		
		
		
	}
}
