package day50_FinalSuperConstruction;

public class ProtuctTest {
public static void main(String[] args) {
	
	PruductSuper p1=new PruductSuper("sony play station");
	
	
	System.out.println(p1); //
	
	PruductSuper p2=new PruductSuper("apple");
	
	System.out.println(p2.getName());
	
	Electronics el=new Electronics("Dyson vacuun",20.0);
	System.out.println(el.toString());
	
	el.buy();
	
	System.out.println(PruductSuper.IS_AVALAIBLE);
 System.out.println(Electronics.IS_AVALAIBLE);
}

	
	
	
	
	
}
