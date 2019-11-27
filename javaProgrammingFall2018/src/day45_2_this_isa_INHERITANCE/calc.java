package day45_2_this_isa_INHERITANCE;

public class calc {
private int result;

//return this ;return the same object from where it was cakked, 
//when we return same object we retain all the DATA for that current object
//return the object itself
//this means= THIS INSTANCE (instance/object)

public calc plus(int num) {
	result+=num;
	return this;
	
}
public calc minus(int num) {
	result-=num;
	
	return this;
	
}

public int getResult() {
	return result;
}











}
