package day24_;

public class arrayLength {
	public static void main (String[] args) {
		
		//declare array names that store 5 names
	  String names[]=new String[5];
	  names[0]="Serik";
	  names[1]="Halil";
	  names[2]="Z";
	  names[3]="Erkam";
	  names[4]="Zarina";
	  
	  System.out.println(names.length);// no parantheses. -when to get size of length.
		
		String name= names[1];
	  System.out.println(name.length());
		
		//whenever we declare an array with size , deoending on whwt tyoe it is,we will get default values
//	  String==null
//			  int,byte,long--0
//			  char== ''
//		
		
		
	}
}
