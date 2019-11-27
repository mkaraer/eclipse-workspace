package day54_WarmupAnfInterface;

public class Child extends Parent {

	
	
		public void getAngry() {
			System.out.println("Child style anger");
		}
		public void beCool() {
			System.out.println("Child stay cool");
		}
	
		public static void main(String[] args) {	
		
			Parent p1= new Child();
		p1.getAngry();
		//down casting
		Child c1=(Child) p1;
		c1.beCool();
		
			
		//upcasting
	//long a=(long)10;
	//downcasting
	//int b=(int)a;
	
//	Parent p= new Child();
//	Child p2= new Child();
	//Parent p=p2;
	
	
	
	
	
	
}
	
	
}


