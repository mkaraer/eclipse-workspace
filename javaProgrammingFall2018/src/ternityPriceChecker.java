
public class ternityPriceChecker {
	public static void main(String[] args) {
		
//		item== 1-50== "cheap"
//		==50-100= "expensive"
//		== not buying
		
		int item= 85;
		String status;
		
//		if (item>=1 && item <=50) {
//			status="cheap";
//		}else if(item>=51&& item<= 100) {
//			status= "expensive";
//		}else {
//			status= "Not buying";
//		}
//		System.out.println("status "+ status);
//		
		status=(item>=1 && item <=50)?"cheap": (item>=51&& item<= 100)? "expensive" : "not buying";
		
		System.out.println("status "+ status);
		
		
	}
}
