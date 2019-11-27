package day25_Arrays;

public class CountMatches {
	public static void main (String[] args) {
		//create a double array called prices
		//asign some 10 or more different prices
		//using al loop count how many items that is more than $20       
		//print the count 
		// if no price was found that is more than $20
		//print no item cost more than$20
		
		double[] prices= {10,12,15,18,20,25,30,35,40,50};
		int count=0;
		  for(double price:prices) {
			if (price>20.0) {
			  	count++;
			}
			}
		  if(count==0) {
			  System.out.println("no itema for more than $20");
		  }else {
			  
		  
		  System.out.println(count+" items with more than $20 ");
		  }
		
		
		
		
		
		
		
		
	}
}
