package day29_;

import java.util.Arrays;

public class carsMultiDArray {
	public static void main (String[] args) {
		
		//create 2D array cars
		//infirst should have 3 groups of cars
//		1.janpanese
//		2.german
//		3.american
//		4.italian
		
		String [][]cars= {{"toyota","honda","mazda","acura","nissan"},
				          {"merceses","audi","mazda","opel",},
				          {"dodge","ford","tesla","jeep","lincoln"},
				          {"ferrari","fiat","lacia"}};
		//System.out.println(Arrays.deepToString(cars));
		
		for(String[] carsGroup:cars) {
			
			for(String  carModels:carsGroup) {
				System.out.print(carModels+" ");
				
			}
			
			
			System.out.println();
				//System.out.print(carModels);
			//System.out.println(cars[0][1]);
			
		}
		
		for(int i=0; i<cars.length; i++) {
			    Switch(i){
				case 0:
				System.out.println("japanese: ");
				break;
				case1:
				System.out.println("german: ");
				break;
				case 2:
				System.out.println("american: ");
			    break;
				case 3:
				System.out.println("italin: ");
				break;
				default;
				System.out.println("no cars");
			}
			
		
			for(int j=0; j<cars.length; j++) {
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
