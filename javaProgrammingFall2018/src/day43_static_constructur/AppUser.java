package day43_static_constructur;

public class AppUser {
 
	private String userID;    // if make static will share make superman for everyone
	private String name;
	private String password;
	private static int count; // must be shared others indepented because everyone has his own
	//Static has only one copy and same variable is SHARED..SHARED VARIABLE OR VALSS VARIBLE
	//all non static instance varibles indepentend objects.
	
	
	public AppUser() {
		count++;
	}
	public AppUser(String userID, String name, String password) {
		
		super();
		System.out.println("try");
		this.userID = userID;
		this.name = name;
		this.password = password;
		count++;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	
	
	
}
