package day39_stringBuilder;

public class AppendAlphabet {
public static void main(String[] args) {
	
	char ch='A';
  	ch++;
	
	System.out.println(ch);
	
	StringBuilder str=new StringBuilder();
	
	for (char chars='A'; chars<='Z'; chars++) {
		//System.out.print(chars);
		str.append(chars);
		System.out.println(chars);
	}
	
	System.out.println(str);
	
	
	
	
}
}
