package day54_Polymorphizm;

public class Horse extends Animal{

	@Override
	public void MakeNoise() {
		System.out.println("hiii hiii");
		super.MakeNoise();
	}

}
