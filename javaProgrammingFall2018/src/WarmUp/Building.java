package WarmUp;

public class Building {

	private String name;
	private String type;
	private static int floorCount;
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Building info; "+name+" "+type+" "+floorCount;
	}

	public Building() {
		
	}
	
	public Building(String name, String type,int floorCount) {
		this.name=name;
		this.type=type;
		this.floorCount=floorCount;
	}
	public void addFloor() {
		floorCount++;
		System.out.println("floorcount increase");
	}
public void addDoor() {
		System.out.println("add doors increased");
	}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public static int getFloorCount() {
	return floorCount;
}

public static void setFloorCount(int floorCount) {
	Building.floorCount = floorCount;
}
}
