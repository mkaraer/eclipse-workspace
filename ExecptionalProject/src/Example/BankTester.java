package Example;

import java.awt.List;
import java.util.ArrayList;

public class BankTester {
public static void main(String[] args) {
	
	//List<BankAccount> accounts=new ArrayList<>();
	
	
    BankAccount b1= new SavingAccount("abc", 34324,-1000);
    System.out.println(b1.toString());
	BankAccount b2= new CheckingAccount("heydar", 1111,-1000);
	System.out.println(b2);
	
	
	
	
	
	
	
	
	
	
	
}
}