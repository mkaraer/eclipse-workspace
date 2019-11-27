package day51_Abstraction;

public abstract class Employee extends Person{
	
	private String jobTitle;
	private double salary;
	
	public Employee(){
	this.jobTitle=	jobTitle;
			this.salary=salary;
	}
	
	
	
	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name) {
		super();
	}

	

	public abstract void work();
	
	
	
	

}
