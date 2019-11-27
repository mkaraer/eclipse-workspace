package day31_;

public class methodsWithReturn {
public static void main(String[] args) {
	int amount=giveme5$();
	System.out.println(giveme5$());// print(amaount)  both true
	
	String president=getPresidentName();
	System.out.println(president);  //System.out.println(getPresidentName());
	
	String name =whatIsYourName();
	  System.out.println(whatIsYourName());        //System.out.println(name);
	
	  String firstname= getName();
	 
	 String lastname= getLastName();
	
	 
	 String email= firstname+" _"+lastname+"@gmail.com";
	  System.out.println(email);
	  
	  email= getName()+"_"+ getLastName()+"@yahoo.com";
	  System.out.println(email);
}


	
	public static int giveme5$() {
	return 5;
	}
	public static String getPresidentName() {
		return "Donald Trump";
	}
	public static String whatIsYourName() {
		String name="Nihal";
		return name;
	}
	
	// method getName,getLastName
	//main you will call these methods and builds an email
	// String email email= [firstname]-[lastname]@gmail.com
	
	public static String getName() {
		return "metin";
	}
	public static String getLastName() {
		return "karaer";
	}
	
	
	
	
	
	
	
	
}
