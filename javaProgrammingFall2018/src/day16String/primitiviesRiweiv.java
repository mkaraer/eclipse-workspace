package day16String;

public class primitiviesRiweiv {
	public static void main (String[] args) {
//		Data types in java:
//			1. primitiev
//			2. object/class types/non primitiev
//			
//			Primitievs
//			wholenumbers/ integr:
//				byte,short,int,long
//				floating poiint numbers/ Numbers with Decimals
//				Float > double
//		     character type
//		     char   and  boolean    true or false
		     
		
		byte chairs=70;
		byte secondRoomChairs= 50;
		int totalChairs= chairs-secondRoomChairs;
		
		System.out.println("first room has "+ chairs+ "chairs");
		System.out.println("second room has "+ secondRoomChairs+ "chairs");
		System.out.println("there are "+totalChairs+ "chairs more in first room.");
		
		System.out.println("first room has "+ chairs+ "chairs "+"second room has "+ secondRoomChairs+ "chairs\n "+
				"there are "+(chairs-secondRoomChairs)+ "chairs more in first room."  );
		                    
		short shortValue= 32000;
		
		int intValue=shortValue;  // it will fit into large type. implcit/automatic casting
		
		intValue= intValue*100;  // 32.000000   asagida print yapilacak -1114 cikacak cunku sigmiyor short int te.
		shortValue=(short)intValue;   //explicit csting
		
		System.out.println("short value after csting"+ shortValue);
		
		int cityPopulation= 2000_000_000; // are allowed we can read easer. compiler will ignore 
		
		long worldPopulation= 8_000_000L;   // dont forget to put L at the and
		
		short ShortNum=500;
		//byte byteNum=(byte)shortNum;
		//System.out.println(byteNum);
		
		double price= 45.33, discount = 12.5;
		
		double total = price = discount;
		System.out.println(price);
		
		int i=10+100;
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
