package day41_capsulationMethods;

import java.util.*;

public class HouseBuilderTest {
public static void main(String[] args) {
	
	HouseBuilder house1= new HouseBuilder();
	house1.type="TownHouse";
	house1.address="1903 Rodgires av.";
	house1.bedroom=3;
	house1.year=2015;
	
	HouseBuilder house2= new HouseBuilder();
	house2.type="Apertment";
	house2.address="3456 lee highway ";
	house2.bedroom=2;
	house2.year=2014;
	
	HouseBuilder whiteHouse= new HouseBuilder();
	whiteHouse.type="Mansion";
	whiteHouse.address="2234 Pensilvania avenue";
	whiteHouse.bedroom=2;
	whiteHouse.year=1800;
	
	System.out.println(house1.type);
	System.out.println(house1.type);
	
	
	int[]nums=new int[4];
	nums[0]=234;
	
	String[] names=new String[4];
	names[0]="Bill";
	
	HouseBuilder [] house= new HouseBuilder[4];
	house[0]=house1;
	house[1]=house2;
	//house[2]=house3;
	house[2]=whiteHouse;
	
	System.out.println(house[0].address);
			
	for(HouseBuilder h:house) {
		//System.out.println(h.year);
		
		for (int i = 0; i < house.length; i++) {
			//System.out.println(house[i].address+" ==> "+house[i].type);
		}
		
		System.out.println(".......ARRAYLIST.............");
		
		List<HouseBuilder>housesList=new ArrayList<>();
		// down covert from array directly
		//List<HouseBuilder>housesList2=new ArrayList<>(Arrays.asList(house));
		housesList.add(house1);
		housesList.add(house2);
		housesList.add(whiteHouse);
		//System.out.println(house1.bedroom);
		
		for(HouseBuilder r:housesList) {
			int year=r.year;
			if(year>=2006&&year<=2016) {
			
			System.out.println(year+"| "+r.address);
			}
		}
		for (int j = 0; j < housesList.size(); j++) {
			HouseBuilder tempHouse= housesList.get(j);
			
			//String tAddress=tempHouse.address;
			
			if(tempHouse.year>=2006&&tempHouse.year<=2016){
				
			System.out.println(tempHouse.year+"..."+tempHouse.address);
		}
		}
	}
}
	public static void printHouseInfo ( HouseBuilder houseObj ) {
	
	System.out.println("Type :"+ houseObj.type);
	System.out.println("Address: "+houseObj.address);
	System.out.println("Bedrooms: "+ houseObj.bedroom);
	System.out.println("Year: "+houseObj.year);			
			
			
			
			
			
			;
}

}


