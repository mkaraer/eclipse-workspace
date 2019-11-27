package day48_Inharitance_super;

public class RecycleBinSuper extends Bin{
	
//public RecycleBin() {
//	setType("Recycle bin");
//}
	public RecycleBinSuper() {
		super("rrecycle bin");
		
		//1)super()- calls parent class constructer
		//this()-calls constructur in same class
		
		//super can be used only within constructer to call parent calss contructer
		//super() must be first statement
	
	}// super we dont need setter to write
	public RecycleBinSuper(String typeOfRecycleBin) {
		super(typeOfRecycleBin);
	
	
	}
	
	
}
