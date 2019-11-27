package day42_costructorThis;

public class etsyRegistrationPage {
public static void main(String[] args) {
	

	etsyAccount account1=new etsyAccount();
	
	account1.setEmail("mkaraer44@hotmail.com");
	account1.setFirstName("metin");
	account1.setPassword("malayata345");
	System.out.println(account1.getEmail());
	
	
	
	etsyAccount account2=new etsyAccount();
	
	account2.setEmail("mkaraer34@hotmail.com");
	account2.setFirstName("joshua");
	account2.setPassword("josh453");
	
etsyAccount account3=new etsyAccount();
	
	account3.setEmail("mkaraer3@hotmail.com");
	account3.setFirstName("_");
	account3.setPassword("123");
	//use getter to read data
	System.out.println("first name of account1: "+account1.getFirstName());
	
	//methods...........
	
	etsyAccount myAccount=new etsyAccount();
	
	myAccount.setAccountInfo("myemail@yahoo.com", "Bill", "abc123");	

	System.out.println(myAccount.getEmail()+" first name: "+myAccount.getFirstName());

//to change
myAccount.setEmail("myemail@yahoo.com");
//myAccount.setEmail(myAccount.getEmail().replace("yahoo", "gamil"));
System.out.println(myAccount.getEmail()+" first name: "+myAccount.getFirstName());

//System.out.println(myAccount.getAccountInfo()); --retun type
/*
 * create a mehod getAccountInfo() that returns email,firstName,password values
 * in this format: myemail@gmal.com|bill|abc123
 */

//System.out.println(myAccount.getAccountInfo());

etsyAccount yourAccount=new etsyAccount();

yourAccount.setAccountInfo("youremail@hotmail.com", "Hukmi", "abc456");



}

private static char[] setAccountInfo(String string, String string2, String string3) {
	// TODO Auto-generated method stub
	return null;
}



}
