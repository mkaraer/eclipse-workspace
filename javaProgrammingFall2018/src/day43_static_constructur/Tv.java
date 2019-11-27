package day43_static_constructur;

public class Tv {
	
	//tv(),turnOn(), turnOff(), setChannel(int newChannel):void , 
	//setVolume(newVolumeLevel)
	//channelUp():void
	//channelDown():void
	//volumeUp:void
	//volumeDown:void
	/*
	 * TV MYTV=NETV()
	 * TV YOUrTv= Tv()
	 */
private int channel=1;
private int volumeLeve=1;
private boolean on=false;
private String brand="undifiend";

public Tv() {
	System.out.println("crating tv object using no args");
	
}
public Tv(String brand) {
	System.out.println("creating tv object with 1 args");
	this.brand=brand;
	
}


public int getChannel() {
	
	return channel;
}
public void setChannel(int channel) {
	if( on &&channel>1&&channel<120) {
		this.channel = channel;
	}else {
		System.out.println("error ,tv is either off or invalid channel");
	}
}
public int getVolumeLevel() {
	return volumeLevel;
}
public void setVolumeLevel(int volumeLevel) {
	if(on&&volumeLevel>=1&&volumeLevel<=20) {
	this.volumeLevel = volumeLevel;
	}else {
		System.out.println("error ,tv is either off or invalid channel");
	}
}
public boolean isOn() {
	return on;
	}
public void turnOn() {
	if(isOn()) {
		System.out.println("TV is already on");
	}else {
		on=true;  // this.on=true 
	}
}
public void turnOff() {
	if(isOn()) {
		on= false;
		
	}else {
		System.out.println("TV is off");
	}
}
public void channelUp() {
	if(isOn()&& channel<120) {
		channel++;
	}
}
public void channelDown() {
	if(isOn()&&channel>1) {
		
	}
}
public void volumeUp() {
	if(isOn()&&volumeLevel<=20) {
		volumeLevel--;
	}
}
public void volumeDown() {
	if(isOn()&&volumeLevel>1) {
		volumeLevel--;
	}
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}













}
