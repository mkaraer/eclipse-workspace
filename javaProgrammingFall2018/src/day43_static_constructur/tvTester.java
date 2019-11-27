package day43_static_constructur;

public class tvTester {
public static void main(String[] args) {
	
	Tv myTv=new Tv();
    Tv smartTv=new Tv("sony");
	Tv cake= new Tv("HP");
	
	System.out.println(smartTv.getBrand());
	
	System.out.println(myTv.isOn());
	System.out.println(smartTv.isOn());
	System.out.println(cake.isOn());
	
	myTv.turnOn();  //we called istance method
	smartTv.turnOn();
	cake.turnOn();
	
     System.out.println(myTv.isOn());
	System.out.println(smartTv.isOn());
	System.out.println(cake.isOn());
	
	myTv.turnOn();
	
	myTv.setChannel(20);
	smartTv.setChannel(55);
	System.out.println("my tv: "+myTv.getChannel());
	System.out.println("smart tv: "+smartTv.getChannel());
	System.out.println(cake.getChannel());// will initiliaze from istance value
	
	myTv.channelUp();
	smartTv.channelDown();
	
	cake.turnOff();
	cake.setChannel(22);
	
	
	
	
	
	
	
	
	
	
	
}
}
