package day47_AcessModifier_01;

public class VaCampus {  //has a VaCampusStudent realtion
	
	VaCampusStudent campusStudent=new VaCampusStudent();
	
	public static void main(String[] args) {
		Student student= new Student();
		student.name="metin";
		//student.ssn     is private
		student.age=36;
		student.campus="McLean";
		
	}
	
	
	
}
