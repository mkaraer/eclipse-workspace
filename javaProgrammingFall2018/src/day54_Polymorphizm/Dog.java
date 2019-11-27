package day54_Polymorphizm;

public class Dog extends Animal{

	@Override
	public void MakeNoise() {
		System.out.println("hawhaw");
		super.MakeNoise();
	
	}
}
