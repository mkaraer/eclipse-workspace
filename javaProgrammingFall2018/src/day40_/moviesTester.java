package day40_;

public class moviesTester {
public static void main(String[] args) {
	
// assign value from movie class
	movie film=new movie();
	film.name="Matrix";
	film.length=30;
	
	movie film2=new movie();
	film2.name="Suoerman";
	film2.length=60;
	
	System.out.println(film.name);
	System.out.println(film2.name);
   
	film.watch();
	film2.watch();
	film.buy(10);
	film2.buy(15);
	
	int totalMin=film.length+film2.length;
	System.out.println(totalMin);
	
	
	
	
	cellPhone cell=new cellPhone();
	cell.brand="nokia";
	System.out.println(cell.brand);
	
	
}


}
