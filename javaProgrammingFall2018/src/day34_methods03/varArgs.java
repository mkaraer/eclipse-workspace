package day34_methods03;

public class varArgs {
	public static void main(String[] args) {
		
		sum(10,20);
		sumAll();
		sumAll(10);
		sumAll(10,20,34,45,56);
		
		soppingList("apple","Kiwi","Bananas");
		soppingList("headphones","new Mac","kitchen aid","spoon");
		
	}
	
	
	
public static void sum(int n1,int n2) {
	System.out.println(n1+n2);
}
	
public static void sumAll(int ... nums) {
	System.out.println("number of input "+nums.length);
	
	int sum=0;
	
	for(int num:nums) {
		sum+=num;
	
		}
	System.out.println("sum"+sum);
}
	// methods: create shopping list that has varargs
// args: String varargs
// it will print shoping ites in single lines, separeted by space
// shoppingList("apple","kiwi","bananas")
//print : shoppingList : apple Kiwi Bananas
	
public static void soppingList(String ... list) {
	System.out.println("Shopping List:");
	
	for(String items:list) {
		
		System.out.print(items+" ");
	
			
	}

	
}
	
	
	
	
	
	
	
}
