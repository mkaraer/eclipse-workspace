package day40_;

public class companyTransEmployee {
public static void main(String[] args) {
	employee emp1=new employee();
	employee emp2=new employee();
	
	emp1.FirstName="Mike";
	emp1.LastName="Smith";
	emp1.email=emp1.FirstName+emp1.LastName+"@gmail.com";
	emp1.JobTitle="Scrum Master";
	emp1.hourlySalary=65.50;
	
	emp2.FirstName="Joe";
	emp2.LastName="Doe";
	emp2.email=emp2.FirstName+emp2.LastName+"@gmail.com";
	emp2.JobTitle="SDET";
	emp2.hourlySalary=54.50;
	
	System.out.println("Emp1 email: "+emp1.email);
	System.out.println("Emp2 email: "+emp2.email);
	
	emp1.work();  // not work top before assigns . first assign
	emp2.work();
	
}
}
