package day54_WarmupAnfInterface;

public class  RegularUser extends SlackUser {
	//int age;    from super class
	//String name;
	int groupNumber;
	
	public RegularUser(int age,String name,int groupNumber) {
		super(age,name);
		this.groupNumber=groupNumber;
	}
	public void sendMessage (String message) {
		System.out.println("regualar user send "+message);
	}
	
public void joinAgroup(int groupnumber) {
	System.out.println("Regular users send "+groupnumber);
	this.groupNumber=groupnumber;
}

	
	
	
}
