package day39_stringBuilder;

import java.util.Arrays;

public class warmUpArrayToStringBuilder {
public static void main(String[] args) {
	
String[] words = new String[5];
words[0]="coffe";
words[1]="tea";
words[2]="water";
words[3]="juice";
words[4]="milk";
	System.out.println(Arrays.toString(words));
	
	//create StringBuilder object
	StringBuilder wordsStb=new StringBuilder();
	
	//without loop
	wordsStb.append(words[0])
	.append(words[1])
	.append(words[2])
	.append(words[3])
	.append(words[4]);
	//System.out.println(wordsStb);
	     // add everthing StringBuilder with using loop
//	
for(String drink:words) {
	wordsStb.append(drink);
}
	
	System.out.println(wordsStb);
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
}
