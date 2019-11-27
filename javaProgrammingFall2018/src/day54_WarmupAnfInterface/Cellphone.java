package day54_WarmupAnfInterface;

public class Cellphone extends Phone{
	int buttunCount=20;
  boolean isTouchScreen;

  @Override
	public void makeCall() {
	  System.out.println("cellphnone is "+buttunCount);
	}

public void callWithoutCable() {
	System.out.println("a method that cell phone ony");
}

  
  
  

}




