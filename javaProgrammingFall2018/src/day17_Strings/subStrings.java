package day17_Strings;

public class subStrings {
	 public static void main (String[] args) {
//		 craete variable diceReults
		 //assign 1-30 of 1,367 postions
		 // using substring extract number of open position
		 
		 String diceResult= "1-30 of 1,367";
		 System.out.println(diceResult.substring(7));
		 
//		 String diceResult= new String("1-30 of 1,367");
//		 String position= diceResult.substring(10,15);
//		 System.out.println(position);
		 
      String languages= new String("Java,Fortrun,English,Cobol,ruby.C#");
		 String lang1= languages.substring(0,4);
		 System.out.println(lang1);
		 String lang2= languages.substring(5,12);
		 System.out.println(lang2);
		 
		 
		 
		 
		 
		 
	 }
}
