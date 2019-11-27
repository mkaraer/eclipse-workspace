package day41_capsulationMethods;

public class HouseTester {
public static void main(String[] args) {
	//step one : crate HouseBuilder object and assign data to fields /variables
	
	HouseBuilder yourHouse=new HouseBuilder();
	yourHouse.type="Cadtle";
	yourHouse.address="100 Masschusset Av Washington";
	yourHouse.bedroom=250;
	yourHouse.year=2019;
	//2.Step .pass your house object to printHouseInfo method
	
	printHouseInfo(yourHouse);
	
	HouseBuilder myHouse2=new HouseBuilder();
	myHouse2.type="townhouse";
	myHouse2.address="100 Masschusset Av Washington";
	myHouse2.bedroom=2;
	myHouse2.year=1998;
	
	printHouseInfo(myHouse2);
	
	//buildHouse(type,address,rooms,year)
//	//HouseBuilder  returnHouse=buildHouse("single","1903 gramesrcy dr",2,1999);
//	System.out.println(returnHouse.address);
//	System.out.println(returnHouse.bedroom);
//	
//	System.out.println(returnHouse); //or alltogether
}	
	
	
	public static void printHouseInfo ( HouseBuilder houseObj ) {
		
		System.out.println("Type :"+ houseObj.type);
		System.out.println("Address: "+houseObj.address);
		System.out.println("Bedrooms: "+ houseObj.bedroom);
		System.out.println("Year: "+houseObj.year);
		
		// Method buildHouse
		// parameters: 4 2 String/2 ints
		//return:HouseBuilder
		//in the method using the values of the parameters build a new house object
		//than return that object
		
//public static HouseBuilder buildHouse(String type, String address, int year,int room) {
//	         HouseBuilder newHouse= new  HouseBuilder();// create this always		
//	        
//	         newHouse.type=type;
//	         newHouse.address=address;
//	         newHouse.year=year;
//	         newHouse.bedroom=room;
//			
//		 
//			return newHouse
//		}
	
	
}


	



}
