package day28_;

public class ArrayHas55 {
	public static void main (String[] args) {
	
	//given an array of ints,print tru if array containsa 5 next to a 5 anywhere in the
			//array. if no consecutives 5 or no are detected in your code then print false.
			
//			nums= {1,5,5,1,1} = true
//			nums= {1,8,5,50}= true
//			nums= {1,5,4,1,5}= false
//			nums= {,4,4,1,99}= false
			
		int[] nums= {7,2,4,5,5};
			
		        boolean found=false;
			
		        for(int i=0; i<nums.length-1; i++) {
				
				if(nums[i]==5 && nums[i+1]==5) {
					
						found=true;
						
						
						break;
						
						
					}
	}
		        System.out.println(found);
				//num[i+1] -- if i is 1 , we are making it 2 and reading index 2
		        //num[1] +1 --- read the value in the arrays and add1 to it
		        //    5 +1 =6

	}
}
