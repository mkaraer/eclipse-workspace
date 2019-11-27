package day24_;

public class PrintArrayValues {
	public static void main (String[] args) {
		//create an array cars and direct assig followong value
		//audi,porche,bmw,toyota,honda,telsa dodge,kia,acura,fiat
		
		String[]cars= new String[] {"moskvich","audi","porche","bmw","toyota","honda","telsa", "dodge","kia","acura","fiat"};
		
		System.out.println(cars.length);
		
		//int i=0;
		//System.out.println(cars[i]);
		//loop
		
		for(int i=0; i<cars.length; i++) {
			System.out.println("numbers "+i+" "+ cars[i]);
			
		}
		
		
		
		
		
	}
}
