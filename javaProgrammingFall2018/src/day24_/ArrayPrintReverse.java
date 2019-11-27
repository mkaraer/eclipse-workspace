package day24_;

public class ArrayPrintReverse {
	public static void main (String[] args) {
		//creat in array scores and assign 10 different numbers
		//betweeen 0 and 100
		//
		
		int []points= new int[] {10,20,30,40,50,60,70,80,90,99};
		
//		// check if 10 points and say 10 points found
//		if(points.length==10) {
//			System.out.println("10 points found");
//		}else {
//			System.out.println("we nees 10points");
//		}
//		// using a for loop each item in reverse in order in same line separeted by space
		//2. using a while loop each item in reverse in order in same line separated by space

		//		for(int p:points) {
//			System.out.print(p+" ");
		//}
		int rev=0;
		
		for(int i=points.length-1; i>=0; i--) {
			
			
			System.out.print(points[i]+" ");
		}
		
	
//		System.out.println("\n=====while loop=========");
//	int k=	points.length-1;
//	while(k>=0) {
//		System.out.print(points[k]+" ");
//		k--;
//		int point=points.length;
//		for (int i=points.length-1; i>=0;  i--) {
//			System.out.print(points[i]+" ");
//			
//		    if (point%2==0) {
//		    	System.out.println("it is even number");
//		   }

	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
	
		
		
		
		
		
		
		
	}
}
