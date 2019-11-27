package day38_wrapperClassesStringBuilder;

import java.util.*;

public class AutoBoxingVSUnBoxing {
public static void main(String[] args) {
	//auto bpxing-- take primitive and convert into wrwpper calss
	//object
	
	int i=100;
	Integer j=i;  // auto boxing
	
	Double d=34.2;
	
	boolean b=true;
	boolean b2=b;
	
	List<Integer>nums=new ArrayList<>();
	nums.add(433);
	int p=555;
	nums.add(p);
	nums.add(new Integer(77));
	
	System.out.println(nums);
	   // UnBoxing == takind the wrapper class object and converting into primitive and happens automatically
	int r = nums.get(0);
	
	boolean bool= new Boolean(false);
	boolean boolprim=bool;
	System.out.println(boolprim);
	
	Character chObj='^';  //autoboxing
	char chPrim=chObj;
	
	char myChar='^';
	Character chObj2=myChar; // autoboxing
	
	char chprim=chObj; // unboxing from character object
	
	Integer intValue = new Integer (400);
	
	if(intValue==400) {              // unboxing 
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
	
	
	String word="java";
	word=word.toUpperCase();
	word=word+"programminng";
	System.out.println(word);
}
}
