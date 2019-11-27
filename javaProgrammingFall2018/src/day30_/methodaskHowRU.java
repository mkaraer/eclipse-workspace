package day30_;

import day31_.calculator;

public class methodaskHowRU {
	public static void main (String[] args) {
		sayHello();
		
		howAreYou();
	   reply();
	   sayBye();
	   sayBye();
	   sayHelloto("Nozim");
	   String nameOfFriend="Umit";
	   sayHelloto("nameOfFriend");  //work
	   
	   calculator.multiplication(34, 25);
	   
	}
	public static void sayHello() {
		System.out.println("Hello");
	}
	public static void sayHelloto(String name) {
		System.out.println("Hello "+name);
		
	}
	public static void howAreYou() {
		System.out.println("How are you");
	

		}
	public static void reply() {
		System.out.println("I am doing well");
	}
	public static void sayBye() {
		System.out.println("byel");
}
}