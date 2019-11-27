package day50_FinalSuperConstruction;

public class PruductSuper {

	private String name;
	
	public static final boolean IS_AVALAIBLE=true;
 
	public PruductSuper() {
	this("unkown");
}
	public PruductSuper(String name) {
		this.name=name;
	}

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "name: "+name;
	}
	public void buy() {
		System.out.println("buy product : "+name);
	}
	
	
	
	
}
