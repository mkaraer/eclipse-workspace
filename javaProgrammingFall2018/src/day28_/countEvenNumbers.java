package day28_;

public class countEvenNumbers {
	public static void main (String[] args) {
		
		//count even numbers in array
		
		int[] nums= {2,1,2,3,4};
		
		int counter=0;
		for(int i:nums) {
			if(i%2==0) {
				System.out.print(i);
				
				counter++;
			}
		}
		System.out.println(counter);
		
		int[] num= {8,1,2,3,4};
		int count=0;
		for(int n:num) {
			if(n%2==0) {
				
				count++;
				
			}
			
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
	}

}
