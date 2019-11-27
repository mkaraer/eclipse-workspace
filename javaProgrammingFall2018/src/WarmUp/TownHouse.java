package WarmUp;

public class TownHouse extends Building{
	boolean isUnit;
	

	public TownHouse(String name, String Type, int floorCount,boolean isUnit) {
		super(name, Type, floorCount);
		this.isUnit=isUnit;
	}

	

	@Override
	public void addDoor() {
		
		super.addDoor();
		System.out.println("ading floor for single house");
	}



	@Override
	public String toString() {
		
		return super.toString();
	}

	
	
	
	
	
}
