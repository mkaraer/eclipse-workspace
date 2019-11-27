package day33_methodwithReturn;

public class converterUtility {
	
public static void main(String[] args) {
	 System.out.println( km(55));
	 if (km(55)<100.0) {
		 System.out.println("speed is good");
	 }else {
		 System.out.println("slowdown");
	 }
	 
	double val=kmV2(98.2);
	System.out.println(val);
	
	System.out.println(fahrenheitToCelcius(35));
	
	if(fahrenheitToCelcius(35)==1) {
		System.out.println("it is correct");
	}else {
		System.out.println("it is not correct");
		
		System.out.println(calculatorWithReturn.add(2,3));
	}
	
}
	
	
	//write a method milesfor km, accepts miles and return km value;
	//return type: double
	//param: 1 double
	
	public static double km (double miles) {
		
		
		 double kms=miles*1.6;
	
		return kms;
	}
	public static double kmV2 (double miles) {
		double kms=calculatorWithReturn.multiplication(miles, 1.6);
		return kms;
	
	}
	
	// method name: fahrenheitToCelcius
	//Action: accepts fahrenheit and  returns Celcius value
	// return type: int
	//pramams: 1 int
	
	public static int fahrenheitToCelcius(int fahrenheit) {
		int Celcius= (fahrenheit-32) * 5/9;
		
		return Celcius;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
