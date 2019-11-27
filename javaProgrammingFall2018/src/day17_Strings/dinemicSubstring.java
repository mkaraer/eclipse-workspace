package day17_Strings;

public class dinemicSubstring {
	 public static void main (String[] args) {
		 String sentence= "we are learning c++ programming";
		 //indexOf()-- accepts a stringg finds the position
		 //String str= "abc start"
		 //str.indexOf("b")--1
		 // str.indexOf("start")==4
		 // fond the postion of Learning
		 // find position of proggmming
		 // pass those numbers to substring ant retreive C++
		 
		 int start= sentence.indexOf("learning");
		 System.out.println(start);
		 
		 int end= sentence.indexOf("programming");
		 System.out.println(end);
		 
		 String language= sentence.substring(start,end);
		start+="learning".length();
		System.out.println(language.trim());
		 
		 
		 
		 
		 
		 
	 }
}
