package day50_FinalSuperConstruction;

public class ProgrammingLanguage extends LanguageHidden{

	public String name="Programming Langeage";
	
	public void printProgmmingName() {
		
		System.out.println("programming L: "+name); //we hide
	}
	
	public static void staticMethos() {  //hiding static 
		System.out.println("Programming Langeage- static Language");
		}

	
//when you declare same variables in the ub calss, 
//it will be variabele HIDING and the clesest version will be used.	

	
	
}
