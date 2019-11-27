package day35_review;

public class MethodAndStaff {
public static void main(String[] args) {
	
	String str="laptop";
     str=delete(str,"p");
	System.out.println(str);
	
	System.out.println(delete("laptop","o"));
	System.out.println(delete("thank","you"));
	
	String str1="heleewon";
	String str2="e";
	int count= numberOfOccurences(str1,str2);
	System.out.println(count);
	System.out.println(numberOfOccurences("message","ss"));
	

}
//delete utility will dlete a given from the given string


public static String delete (String str1, String str2) {
	String newOne=str1.replace(str2, "");
	return newOne;
}
//given a string ,write a method which returs
//how many times a certain character appears on a string

public static int numberOfOccurences(String str1,String str2) {
    int count=0;
   for (int i = 0; i <str1.length()-1; i++) {
  String current=""+str1.substring(i,i+str2.length());
  if(current.equals(str2)) {
	  
	  // to find to letters next to eacother use substring
//	  String current=""+str1.substring(i,i+2);
//	  if(current.equals(str2)) {
//	  }
//	  
	  count++;
  }

   } 
	return count;
}






}
