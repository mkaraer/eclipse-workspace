package day47_AccessModifier_02;

import day47_AcessModifier_01.VaCampusStudent;
public class UENStudent extends VaCampusStudent {
	
public static void main(String[] args) {
	VaCampusStudent va=new VaCampusStudent();
	va.name="sfs";
	va.setBadgeID(23);
	System.out.println(va.name);
	
}
}
