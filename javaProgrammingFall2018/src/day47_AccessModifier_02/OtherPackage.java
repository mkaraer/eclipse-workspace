package day47_AccessModifier_02;

import day47_AcessModifier_01.Student;
import day47_AcessModifier_01.VaCampusStudent;

public class OtherPackage {
public static void main(String[] args) {
	
	Student student= new Student();
	student.name=" kike";
	//student.ssn=344665; not visible
	//student.age=34;  protected isnot visible in other packege
	//student.campus="chicago"; public isnot working
	VaCampusStudent v=new VaCampusStudent();
	
	
	
	
	
	
	
	
}
}
