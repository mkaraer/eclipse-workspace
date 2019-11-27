package day29_;

public class MultiDimontionArray {
	public static void main (String[] args) {
		int[][]nums=new int[2][3];// 2 (groups)columns down and 3 values right
		
		nums[0][0]=10;   
		nums[0][1]=20;
		nums[0][2]=30;
		
		nums[1][0]=40;
		nums[1][1]=50;
		nums[1][2]=60;
		
		int[][] nums1= {{10,20,30}, {40,50,60}};  // same as above and we can add differnet size aswell..
		//basic readig.
		System.out.println(nums[0][0]);  // 10
		System.out.println(nums[0][2]);  //30
		// reading length from 2D array:
		// find out how many 1D arrays in 2D arrays:
		System.out.println("Number of arrays: "+nums.length); //2 arrays /groups
		//how many ites in first array
		System.out.println("Number of values in first array: "+nums[0].length);// 3 
		System.out.println("Number of values in first array: "+nums[1].length);
		
		int[][] nums2= {{10,20,30}, {40,50,60},{70,80}}; 
		
		System.out.println(nums2.length);
		System.out.println(nums2[0].length);
		System.out.println(nums2[2].length);
		
		//ways of cerating 2D arrays: double price= 10.4;
		//1.
		 double [][] prices= new double[3][4]; // 12 prices
		   prices[0][0]= 1095.4;
		   prices[2][3]= 743.43;
		   //2.
		 double[][]prices= new double[3][];  // there are 3 arrays but dont know how many values.
		     prices[0]= {234.34,234.56,788.45};
		     prices[1]= new double{232.2,100.4};
		     
		     price[2]=new double[10];
		     prices[2][0]= 234.67;
		     
		     prices[2][9]=1234.67;
		  //3.
		     double[][] prices= {{234.4,345.5,456.6},{12.34,45.56,87.45,43.6,67},{1,2},{100.4}};
		     
		 
		
		
		
		
		
		
		
		
		
		
		
	}
}
