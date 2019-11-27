package day33_methodwithReturn;

public class calculatorWithReturn {

	

public static double calculate(double n1,double n2, char operator) {
	int result;
	switch(operator) {
	case '+':
		return add(n1,n2);
	case'-':
		return substract(n1,n2);
	case'*':
		return multiplication(n1,n2);
	case'/':
		return divide(n1,n2);
		default:
		throw new RuntimeException("erorr");
		
		
	}
	
	
}
public static double add(double num1, double num2) {
		double total = num1 + num2;
	return total;
	
	

}


	public static double substract(double num1, double num2) {
		double total = num1 + num2;
	return total;
	}

public static double multiplication(double num1, double num2) {
	double total = num1 * num2;

	return total;
}
public static double divide(double num1, double num2) {

	if (num2 == 0) {
		System.out.println("eror");
return -1;
	} else {
		double total = num1 / num2;
		
		return total;
	}
}









}
