package day45_2_this_isa_INHERITANCE;

public class HAS_ARelationTest {
	public static void main(String[] args) {

		Engine carEngine = new Engine();

		carEngine.cylinders = 4;
		carEngine.horsepower = 234;
   
		car Camry=new car();
		Camry.model="Toyota Camry";
		Camry.engine=carEngine;
		
		// print
		System.out.println(Camry.model);
   System.out.println(Camry.engine.cylinders);
   System.out.println(Camry.engine.horsepower);
   
   car car2=new car();
   car2.model="BMW";
   car2.engine=new Engine();
   car2.engine.cylinders=6;
   car2.engine.horsepower=500;
   
   car car3 = new car();
   car3.engine=new Engine(8,687);
   car3.model="Audi";
   
   System.out.println(car3.model+" has "+ car3.engine.cylinders+" clynders ");
   
   
   
   
   
   
   
   
   
   
	}
}
