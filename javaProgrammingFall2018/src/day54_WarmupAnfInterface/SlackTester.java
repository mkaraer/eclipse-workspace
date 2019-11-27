package day54_WarmupAnfInterface;

public class SlackTester {
	public static void main(String[] args) {
		RegularUser u1=new RegularUser(23, "John", 6);
		u1.sendMessage("hello world");
		u1.joinAgroup(13);
		
		AdminUser u2= new AdminUser(30, "Akbar", true);
		u2.sendMessage("hello student");
		u2.activateUser("john");
		u2.deActivateUser("haydar");
		
		
		
		
		
		
		
		
		
	}

}
