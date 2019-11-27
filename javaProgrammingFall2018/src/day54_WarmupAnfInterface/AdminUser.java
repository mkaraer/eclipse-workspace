package day54_WarmupAnfInterface;

public  class AdminUser extends SlackUser{

	boolean isOwner;
	
	public AdminUser(int age,String name,boolean isOwner) {
		super(age, name);
		this.isOwner=isOwner;
		}
	public void deActivateUser (String name) {
		System.out.println("Admin user can send message "+name+" wtih@channel");
	}
	public void activateUser (String name) {
		System.out.println("Amin user deactivate users "+name);
		
	}
	public void sendMessage (String message) {
	System.out.println("Amin user deActivate user "+name);
}

	
	
	
	
	
	
	
}
