package day25_Arrays;

public class searchInArray {
	public static void main (String[] args) {
		// create array and assign 10 different numbers to it
		//search for a number 100 in it using a loop, once found print the index
		//location and value at "index"+index
		// if that sarch isnot found value is not found print 100 is not found
		// exit
		
		int[] num=  {1000,200,100,4,5,6,7,8,9,10};
//		int lookfor=100;
//		boolean found=false;
//		for(int i=0; i<num.length;  i++) {
//		if (num[i]==lookfor) {
//			System.out.println( lookfor+" was found at index "+i);
//			found=true;
//			break;
//		}
//		}
//		   //!found
//		if(found==false) {
//		System.out.println(lookfor + " not found");
//		}
		int lookfor=100;
		for( int i=0; i<num.length; i++) {
			if(num[i]==lookfor) {
			System.out.println(lookfor);
		break;	
		}
		
		}
		
		
		
		
		
		
		
		
		
	}
}