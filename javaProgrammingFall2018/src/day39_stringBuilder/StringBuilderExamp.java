package day39_stringBuilder;

public class StringBuilderExamp {
public static void main(String[] args) {
	
	// String is immutable(cant change)// stringBuilder is immutable.(can be modified)
	//appent
	//delete(start,end)...delete.charAt(0)
	//reverse
	//deleteCharAt(index)
	//insert(index,String).. inserts the value at the specified index position.. stb="keyboard" stb.insrt(3,"-"); key-board
	//replace(start,end,String)--stb=keyboard; stb.replace(0,3,"Cutting"); ==cuttingBoard==	
	StringBuilder stb1=new StringBuilder("Halleween");
	
	StringBuilder stb2=new StringBuilder();
	stb2.append("java");  // to add
	
	stb2.append("sql"+",C+,").append("HTML");
	System.out.println(stb2);
	
	StringBuilder listBuilder=new StringBuilder("Wooden Spoon");
	listBuilder.append(",iron spoon");
	System.out.println(listBuilder);
	
	listBuilder.append('|');
	
	listBuilder.append(100);
	System.out.println(listBuilder);
	
	String s="aaa";
	s=s+100;
	s=s+true;
	s=s+'%';
	System.out.println(s);
	
	StringBuilder letter=new StringBuilder("ABCDEFGD");
	
	letter.append("GG DDFFH");
	
	letter.delete(0, 3);
	System.out.println(letter);
	
	StringBuilder sentence= new StringBuilder("java is fun!");
	sentence.reverse();
  System.out.println(sentence);
	
  sentence.deleteCharAt(0);
  System.out.println(sentence);
	
  sentence.deleteCharAt(sentence.length()-1);
  System.out.println(sentence);
	
  StringBuilder stbInsert= new StringBuilder("SeleniumAutomation");
  stbInsert.insert(8, " Test ");
  System.out.println(stbInsert);
	
  stbInsert.replace(0, stbInsert.indexOf(" "),"Appium ");
  System.out.println(stbInsert);
  
  
  
  
  
	
	
	
}
}
