package day10_conditions4;

public class calculator {
	public static void main(String[] args) {	
 double num1,num2,result;
 char operator;
 
 num1=5;
 num2=3;
 operator = '+';
 
	switch(operator) {
	case'+':
		result= num1+num2;
		break;
	case '-':
		result= num1-num2;
	break;
	case '*':
		result= num1*num2;
		break;
	case '/' :
		result= num1/num2;
	break;
	case '%' :
		result= num1% num2;
	break;
	default:
	System.out.println("invalid");
	return; //dont run the rest of the rpogram
	}
	System.out.println(result);
	}
}
