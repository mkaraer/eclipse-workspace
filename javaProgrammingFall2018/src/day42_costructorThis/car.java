package day42_costructorThis;

public class car {
//encapsulated instance vaibale
	// String type
	//String make
	// String Model
	// int speed
	
	// getter and stter methods
	
	//,ethods: void accellarate (int mph)
	//  increases, current speed value by mph value
	//print make type is accellerating........ accellerate(10);=== speed+=10
	    private String type;
		private String make;
		private String Model;
	    private int speed;
	    
	    public car() {
	    	System.out.println("car class is constructor");
	    	type="unknown";
	    	make="inkown";
	    	Model="unknown";
	    }
	    public car(String type, String make, String model) {
	    System.out.println("3 args constructer");
	    this.type=type;
	    this.make=make;
	    this.Model=model;
	    }
	    
		public void accelerating(int mph) {
			speed+=mph;
			System.out.println(make+" "+type+" is accelerating");
		}
	    
	    public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public String getModel() {
			return Model;
		}
		public void setModel(String model) {
			Model = model;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
