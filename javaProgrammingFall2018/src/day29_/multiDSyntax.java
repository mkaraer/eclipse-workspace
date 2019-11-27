package day29_;

import java.util.Arrays;

public class multiDSyntax {
	public static void main (String[] args) {
		
		double[][]prices= new double[3][];  // there are 3 arrays but dont know how many values.
		
		prices[0]= new double[] {234.34,234.56,788.45};
		prices[1]= new double[] {232.2,100.4};
		prices[2]= new double[5];
		prices[2][0]=543.34;
		prices[2][1]=6543;
		prices[2][2]=123.54;
		prices[2][3]=6543;
		prices[2][4]=1233.54;
		
		System.out.println(Arrays.toString(prices[0])); //[234.34, 234.56, 788.45]
		System.out.println(Arrays.toString(prices[1]));// [232.2, 100.4]
		System.out.println(Arrays.toString(prices[2]));//[543.34, 6543.0, 123.54, 6543.0, 1233.54]
		
		System.out.println(prices[2][0]);
		
		System.out.println(Arrays.deepToString(prices));// [[234.34, 234.56, 788.45], [232.2, 100.4], [543.34, 6543.0, 123.54, 6543.0, 1233.54]]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
