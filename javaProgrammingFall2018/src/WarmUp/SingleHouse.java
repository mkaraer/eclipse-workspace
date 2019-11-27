package WarmUp;

public class SingleHouse extends Building {

	double hoaFee;

	
	public SingleHouse(String name, String Type, int floorCount,double hoaFee) {
		super(name, Type, floorCount);
		this.hoaFee=hoaFee;
	}
@Override
	public void addDoor() {
		
		super.addDoor();
		System.out.println("add door in a single house");
	}
@Override
	public String toString() {
		
		return super.toString()+hoaFee+"SingleHouse";
	}}
