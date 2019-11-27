package day54_Polymorphizm;


	public class Cat extends Animal{

		@Override
		public void MakeNoise() {
			System.out.println("miyav");
			super.MakeNoise();
		}

}
