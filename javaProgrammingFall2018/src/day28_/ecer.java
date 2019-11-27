package day28_;

import java.util.Arrays;

public class ecer {
	public static void main(String[] args) {

//		int [] nums= {7,32,5,23};
//		Arrays.sort(nums);
//		
//		System.out.println(Arrays.toString(nums));
//		
//		int []a= Array.copyOf(nums,0);
//		System.out.println(
//				
//				
////				
//		String word = "xxxbananaxxx";
//		int count = 0;
//		int counter = 0;
//		boolean b = true;
//		for (int i = 0; i < word.length(); i++) {
//			if (word.charAt(i) == 'x' && b || word.charAt(i) == 'X' && b) {
//
//				counter++;
//			} else {
//				b = false;
//			}
//		}
//
//		System.out.println("abi");
//
//		b = true;
//		for (int i = word.length() - 1; i >= 0; i--) {
//			if (word.charAt(i) == 'x' && b || word.charAt(i) == 'X' && b) {
//				count++;
//			} else {
//				b = false;
//			}
//		}
//		String temp = word.substring(counter, word.length() - count);
//		System.out.println(temp);
//
//		int a = 5;
//		int c = 10;
//		a = a + c - (c = a);
//		System.out.println(a);
//
//		System.out.println(c);
//
//		// String[]email= "caig_federighi@apple.com";
//
//		String name = "abc hi how hi";
//		String lookFor = "hi";
//
//		int county = 0;
//
//		for (int i = 0; i < name.length(); i++) {
//
//			if (name.charAt(i) == 'h') {
//
//				if ((name.length() >= i + 1) && name.substring(i, i + 1).equals("hi")) {
//
////					county++;
//
//				}
//			}
//
//		}
//
//		System.out.println(county);

		String name1 = "how many javascript are there in java class java";
		int coun=0;
		String[] cut=name1.split(" ");
		System.out.println(Arrays.toString(cut));
		for(int i=0; i<cut.length; i++) {
			
				if(cut[i].equalsIgnoreCase("java")) {
					coun++;
				}
			}
//		
	//	String name1 = "how many java are there in java class";
		System.out.println(coun);
	//	int coun = 0;
	//
		
		if (name1.length() >= 4) {
//
			for (int i = 0; i < name1.length()-4; i++) {

				if (name1.substring(i, i + 4).equals("java")) {
					coun++;
				}

			
			}}
//			System.out.println(coun);
//		} else {
//			System.out.println(coun);
//		}

//		
		// find the biggset number
//		int n1 = 0;
//		int n2 = 2;
//		int n3 = 3;
//		if (n1 > n2 && n1 > n3) {
//			System.out.println("n1 is biggest");
//		} else if (n2 > n1 && n2 > n3) {
//			System.out.println("n3 is biggest");
//		} else {
//			System.out.println("n3 is biggest");
//		}
//
//		int[] biggest = { 3, 2, 9 };
//
//		int max = 0;
//		for (int big : biggest) {
//			if (big > max) {
//				max = big;
//			}
//		}
//		System.out.println(max);

//    int grade=0;
//    String status=" ";
//    if(grade>=0) {
//    	status="excellent";
//    }else if{
//    	if(grade>=70&&)
//    }
    
		int grade=75;
		String excellent,good,pass,fail;
		
		if(grade>=90) {
			System.out.println("excellent");
		}else if(grade>=70&&grade<=90) {
			System.out.println("good");
		}else if(grade>=60&&grade<=70) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
//		int premium customers 1 freeBook=5 
//				           2 freeBook=8
//				          
//		int nbooksPurchased = 1 free=7
//		                      2free=12
		
	int premium=3;
	int nbooksPurchased=0;
	int free=0;
	
	if(premium>=5) {
		System.out.println("1 free book");
	}else if(premium>=8) {
		System.out.println("2 free books");
	}else if(nbooksPurchased>=7) {
		System.out.println("1 free book");
	}else if(nbooksPurchased>=12) {
		System.out.println("2 free books");
	}else {
		System.out.println("sorry no free books");
	}
	
	//free=(premium>=5)?"1 free book":(premium>=8)?"2 free books" : (nbooksPurchased>=7)? "1 free book":
	//	  (nbooksPurchased>=12)? "2 free books" : "sorry no free books";
	
	
	int c=0;
	String [] str= {"ali","veli","osman","settar"};
	
	for(String s:str) {
		System.out.println(s.contains("e"));
	}
	
	
	
//	for (int i = 0; i < str.length; i++) {
//		
//		if(str[i].equalsIgnoreCase("veli")) {
//			for (int j = 0; j < str[i].length(); j++) {
//				if(str[i].charAt(j)=='i') c++;
//			}
//			
//		}
//	}
//	
//	
//	System.out.println(c);
//	int k=0;
//	for (int i = 0; i < str.length; i++) {
//		if(str[i].equalsIgnoreCase("settar")) {
//			
//			for (int j = 0; j < str[i].length(); j++) {
//				if(str[i].substring(j,j+1).equals("t")) 
//					k++;
//					
//				
//				
//			}
//		}
//	}
//	System.out.println(k);
	int h=0;
	
	String str2="acbvxxxaaasjb";
	
	String words="";
	
	for (int i = 0; i < str2.length()-2; i++) {
		
			//if(str2.charAt(i)==str2.charAt(i+1)&&str2.charAt(i+1)==str2.charAt(i+2) ) {
		if(str2.substring(i, i+1).equals(str2.substring(i, i+2))) {
				h++;
			}
		
	}
	System.out.println(h);
	String txt="";
String tx="foo";


	//for (int i = 0; i < tx.length()-1; i++) {
		
//		for(String t:tx) {
//			txt+=t;
//		}
		//}
//			
//		}
		System.out.println(tx.charAt(0)+""+tx.charAt(1));
	
	String word="xHiX";
	
	
	for (int i = 0; i < word.length(); i++) {
	if(word.charAt(i)=='x'||word.charAt(word.length()-1)=='X') {
			
		}
	}
	
	String ok="xxlaptopX";
	String nweOne=ok.replace("x", "");
	
		System.out.println(nweOne);	
	
		String str1="message";
		String str3="s";
		
		 int count=0;
		   for (int i = 0; i <str1.length(); i++) {
		  String currentChar=""+str1.charAt(i);
		  if(currentChar.equals(str3)) {
			  count++;
	
		  }
		   }
System.out.println(count);












		   
		   }


	}


