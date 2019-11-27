package day30_;

public class cooking {
	public static void main (String[] args) {
		
// method cook accept string food name and prints
		// today we are cokong foodName
		
		//mothod youWillNeed, accepts string with thing we nees
		//print we need followind items: "items"
		
		//method cookFor accepts minutes and way of cooking and print
		// you need to cook for minutes by means of wayOfCookig
		
		// method ready, doesnt accept any parameters
		//print meal is ready enjoy
		
	 cook( "lahman");
	 youWillNeed("flour,sugar,carrot");
	 cookFor(5 ,"in the oven");
	 
		
		
	}

	public static void cook(String name) {
		System.out.println("Today we are cooking "+ name);
	}

	public static void youWillNeed(String items ) {
	
	System.out.println("we need followind items: "+items);
	}
	public static void cookFor(int min,String wayOfCooking) {
		
		System.out.println("we need : "+min+ "min"+wayOfCooking );
		}



}






