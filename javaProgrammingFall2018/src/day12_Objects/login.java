package day12_Objects;

public class login {
	public static void main(String[] args)  {
		String secretUserName="admin";
		String secretPassword="abc12";
		
		// 2 variables user name and password
		// make sure they match with secret ones.and login 
		 String userName="adminn";
		 String password= "abc123";
		
		 if (userName.equalsIgnoreCase(secretUserName)&& password.equals(secretPassword)) {
			 System.out.println("login succsessful");
		 
		 }else  if (!userName.equalsIgnoreCase(secretUserName)){
			 System.out.println("valid user name");
		 
		 }else  if (!password.equals(secretPassword)){
			  System.out.println("password valid");
		 
		 
		 } else  if (!userName.equalsIgnoreCase(secretUserName)&& !password.equals(secretPassword)){
			 System.out.println("password and username valid");
		 }else {
			 System.out.println("erorr");
		 }
			 
			 
			 
			 	 
		 }
	}

