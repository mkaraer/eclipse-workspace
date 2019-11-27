package day40_;

public class employee {
/*
 * intance varibales
 * firstName, last name, jobTitle,salary
 */
	
	String FirstName;
	String LastName;
	String email;
	String JobTitle;
	double hourlySalary;
	
	public void work() {
		System.out.println(FirstName+" is working as "+ JobTitle);
	}
	
	public static void main(String[] args) {
		
		employee emp1=new employee();
	
	emp1.FirstName="Mike";
	emp1.LastName="Smith";
	emp1.email=emp1.FirstName+emp1.LastName+"@gmail.com";
	emp1.JobTitle="Scrum Master";
	emp1.hourlySalary=65.50;
	
	System.out.println("First Name: "+emp1.FirstName);
	System.out.println("Last Name: "+emp1.LastName);
	System.out.println("Jobt itle: "+emp1.JobTitle);
		
	
	emp1.work();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
