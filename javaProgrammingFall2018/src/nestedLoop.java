import java.util.Scanner;

public class nestedLoop {
	public static void main (String[] args) {
		// how much items you bought
		//ask items and price tahat many times
		//string valuables items and separete with coma
		//total price
		
		
		Scanner scan = new Scanner(System.in);
		
	
		System.out.println("how many items do you have?");
		int itemsCount=scan.nextInt();
		String allItems="";
		double totalPrice=0;
		
		for(int i=1; i<=itemsCount; i++) {	
				 System.out.println("what is the item");
				 String item = scan.next();
				 
				 System.out.println("how much is it "+"?");
				 double price=scan.nextDouble();
				 
				 if (i==itemsCount) {
					 allItems=allItems+ item;
				 }else {
					 allItems=allItems+ item+",";
				 }
				 
				 
                 totalPrice+=price;
		}
		System.out.println("your items: "+allItems);
		 System.out.println("toatal price:$ "+totalPrice);
		 
				
		
		
		
		
		
	}
}
