
public class ternaryOperator {
	public static void main(String[] args) {
		
		// ternary= ? demek
		// max score=100   passing score is 60
		int score= 70;
		String status;
		
		if (score>= 60) {
			status="passed";
			
		}else if (score<60) {
			status="failed";
		}
		

		status=(score>=60 )? "pass" : "fail";
		
		System.out.println("status is  " + status);
		
		// boolean express
//		if true  shipping= 25$
//	    if false  shipping= 15$
	    
	    
	boolean express=true;
	
	int shipping= ((express)? 25:15);
	
	System.out.println(shipping);
		
		
		
		
	}
	
}
