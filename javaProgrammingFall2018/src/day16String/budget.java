package day16String;

public class budget {
	public static void main (String[] args) {
		
		double budget=190;
		double phone=250.0;
		double watch=105.5;
		double bag= 80;
		
		if (budget<=79) {
			System.out.println("you cant buy anuthing");
		}
		if(budget>=475 ) {
	        System.out.println("you cn buy everyting");
		}else if(budget>=phone+watch) {
			System.out.println("you van buy watch ,phone and bag");
			
			
		}else if(budget>=phone+bag) {
			System.out.println("you can bu phone and bag or watch and bag");
		}else if (budget>=bag+watch) {
			System.out.println("you van buy watch ,watchand bag or only bag or watch");
		}else if (budget>=bag) {
			System.out.println("you van buy bag");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
