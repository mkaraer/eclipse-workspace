package day51_Abstraction;

public class FTEEmployee extends Employee{
	private double bonus;
	
public 	FTEEmployee(String name,int age) {
	super();
	this.setAge(age);
}
	
	
	
	
	
	public void speak() {
		
	}
	@Override
		public void work() {
			System.out.println("FTE work");
			
		}
	public double getBonus() {
		return bonus;
	}





	public void setBonus(double bonus) {
		this.bonus = bonus;
	}	
	
	
	
	
	
	
	
	
	

}
