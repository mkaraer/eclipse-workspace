package day33_methodwithReturn;

import day31_.calculator;

public class compareCalculators {
public static void main(String[] args) {
	
	calculator.add(4, 3); // import from other file and void this is enough
	
	//double resul=calculator.add(4, 3);   not works becuse it is void doesnt return
	
	
	//System.out.println(calculator.add(4, 3));

	double total =calculatorWithReturn.add(3.0,4.0);  // we return thats why we put double total
	if(total==7.0) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
		// we dont need to write all variable again just import.....:)
		
		         calculator.substract(5, 2);
		//double total =calculatorWithReturn.substract(5,3);
		         
		         
	//System.out.println(	calculatorWithReturn.calculate(5, 3, '-') );      
		         
		         
		         
		         
	}
	
	
	
}















}
