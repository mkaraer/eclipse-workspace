package day06_operators;

public class swapVarValues {
	public static void main(String[] args) {
		
		int apples=100;
		int oranges=200;
		
		int tempContainer = apples; // degistirmek icin baska containra aktarip print yapmaklazim..
		apples= oranges;
		oranges=tempContainer;
		
		System.out.println("Oranges:"+oranges+ "|apples: "+apples);
		
		
		
		
		
		
		
	}
}
