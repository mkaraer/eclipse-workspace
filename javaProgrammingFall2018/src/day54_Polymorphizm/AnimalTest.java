package day54_Polymorphizm;

import java.util.*;

public class AnimalTest {
	public static void main(String[] args) {

		Animal dog = new Dog();
		dog.MakeNoise();

		Animal cat = new Cat();
		cat.MakeNoise();

		Animal[]animals= {dog,cat};
		
		for (Animal a : animals) {
			a.MakeNoise();
//			hawhaw                  the result is same...
//			animals makes noise
//			miyav
//			animals makes noise
			
			List<String[]> a1= new ArrayList<>();
			
			
		}
		
		
		
		
	}

}
