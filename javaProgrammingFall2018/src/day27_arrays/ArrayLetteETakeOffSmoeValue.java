package day27_arrays;

public class ArrayLetteETakeOffSmoeValue {
	public static void main (String[] args) {
	
	String[] arr = new String[] {"zero","one","two","three","four"};
	
	int counter=0;
	for( String str:arr) {
		if(str.contains("e")) {
			counter++;
		}
	}
	System.out.print(counter);
	
	// create array fewValues, with suze if counter
	String[] fewValues= new String[counter];
	
	//go over arr one more time and add words with e into fewValues
	
	int i=0;
	for (String each : arr) {
		if(each.contains("e")){
			fewValues[i]=each;
			i++;
	}
	}
		for(String val: fewValues) {
			System.out.print(val+" " );
		}
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
}
}