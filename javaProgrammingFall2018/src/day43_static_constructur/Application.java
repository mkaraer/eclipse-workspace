package day43_static_constructur;

public class Application {
public static void main(String[] args) {
	
	AppUser user1=new AppUser("ironman","Mark Simith","ac123");
	AppUser user2=new AppUser("postman","Sar Sma","ac123");
	AppUser user3=new AppUser("superman","hi joe","fc123456");
	
	user1.setCount(100); // we are changing account
	
	System.out.println(user1.getCount());
	System.out.println(user2.getCount());
	System.out.println(user3.getCount());
	
	AppUser user4= new AppUser();
	System.out.println(user4.getCount()); //
	
	System.out.println(user1.getUserID());
	System.out.println(user2.getUserID());
	
	user3.setName("metin");
	System.out.println(user3.getName());
	
}
}
