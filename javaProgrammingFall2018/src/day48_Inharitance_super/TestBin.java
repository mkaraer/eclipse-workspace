package day48_Inharitance_super;

public class TestBin {
public static void main(String[] args) {
	
	Bin yourBin= new Bin();
	System.out.println(yourBin.toString());
	
	yourBin.add("book");
	yourBin.add("notebook");
	yourBin.add("ipad");
	
	System.out.println(yourBin.toString());
	
	yourBin.remove("book");
	
	System.out.println(yourBin.toString());
	
	RecycleBinSuper rBin =new RecycleBinSuper();
	rBin.add("Bottle");
	
	System.out.println(rBin);
	
	
	
	
	
	
	
}
}
