package day24_;

public class arrayExample {
	public static void main (String[] args) {
//		elemet= values(knife, fork etc)
		//create and array called kitchenItems   // Arrays are fix size we cant increse or dicrese
		//knife,wooden spoons, plates,cups, forks, pan, pot, trash can, fridge,dishwasher
		//using a for each loop iterate through each item:
		//within your loop for each loop have scitch statement
//		switch(itmem){
//		case"knife":
//			print knife is used for cuttingceggies";"
//			break;
//		}
	
		String[] kitchenItems= {"knife","wooden spooons", "plates","cups", "forks", "pan", "pot", "trash can", "fridge","dishwasher"};
		
		
   	for(String item: kitchenItems) {
   		//System.out.println(item);	
			
   	item=item.toLowerCase().trim();
			switch(item){
			case"knife":
				System.out.println("knife for cutting");
				break;
				
				case"plates":
					System.out.println("plate for eating");
					break;
				
				case"wooden spoon":
					System.out.println(" wooden spoon it is for soup");
					break;
				
				case"cups":
					System.out.println("cup for drinking");
					break;
				case"forks":
					System.out.println("fork for batting");
					break;
					case"pan":
					System.out.println("pan or heating");
					break;
		}
		
			}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
