package day51_Abstraction;

public class PersonTester {
public static void main(String[] args) {
	
	FTEEmployee fte=new FTEEmployee("ali",45);
	
	System.out.println(fte.getName());
	
	fte.setJobTitle("teacher");
	fte.setAge(32);
	fte.setName("ah");
	System.out.println(fte.getAge());
	
}
}
