package day28_;

import java.util.Arrays;

public class equals {
	public static void main (String[] args) {
		
		// when two arrays with same length and samaorder of elements then they are equals
		// result true or false
		
		int[]a= {1,2,3};
		int[] b= {1,2,3};
		int[]c= {1,2,3,4};
		int[]d= {1,2,4,3};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(c, d));
// sort the d array and compare with c array
		
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.equals(c, d));
		
		// use operators to campare instead of equals method
		System.out.println(a==b); // not correct
		
		int[]j=a; // j will have a value
		System.out.println(Arrays.toString(j));
		
		j[0]=1000;
		System.out.println(Arrays.toString(j));
		System.out.println(Arrays.toString(a));  // a will also have same value. because of up--int[]j=a;--
		
		
		
		
		
		
		
		
		
		
	}
}
