package day42_costructorThis;

public class etsyAccount {

	private String email;
	private String firstName;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
		this.email=email;
	}
	public String getFirstName() {
		
		return firstName;
	}
	public void setFirstName(String firstNAme) {
		this.firstName=firstNAme;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length()<6) {
			System.out.println("must be at least 6 caharacters");
			return;
		}
	this.password=password;
	}
	//.....methods.............
	
public void setAccountInfo(String email, String firstName, String password ) {
	this.email=email;
	this.firstName=firstName;
	//this.password=password;
	setPassword(password);  // because of condition
	
	}
	public String getAccountInfo(String email, String firstName, String password ) {
		String ret= email +"/"+firstName+"|"+password;
		return ret;
	}
	
	
}
//THIS IS AKEY in java
//this.
//this()
//1.this.--access to istance variables with same name and diffirindiate one is istance variable
