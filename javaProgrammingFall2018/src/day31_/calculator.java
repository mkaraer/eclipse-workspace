package day31_;

import java.util.*; // star import everything random etc

public class calculator {
	public static void main(String[] args) {
		double n1 = 10;
		double n2 = 5;

		add(n1, n2);
		substract(n1, n2);
		multiplication(n1, n2);
		divide(n1, n2);
		// add more numbers?
		// add scanner

		// add select 1
		// subt selecet 2
		// multi selecet 3
		// divide select 4
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		n1 = input.nextDouble();
		n1 = input.nextDouble();

		System.out.println("chose oprataions\n" + "1- add\n" + "2 subtract\n" + "3-multiplication\n" + "4 divide\n");
		int operation = input.nextInt();
		switch (operation) {
		case 1:
			add(n1, n2);
			break;
		case 2:
			substract(n1, n2);
			break;
		case 3:
			multiplication(n1, n2);
			break;
		case 4:
			divide(n1, n2);
			break;
		default:
			System.out.println("invalit eror");
		}

	}

	public static void add(double num1, double num2) {
		double total = num1 + num2;

		System.out.println(total);
	}

	public static void substract(double num1, double num2) {
		double total = num1 - num2;

		System.out.println(total);
	}

	public static void multiplication(double num1, double num2) {
		double total = num1 * num2;

		System.out.println(total);
	}

	public static void divide(double num1, double num2) {

		if (num2 == 0) {
			System.out.println("eror");

		} else {
			double total = num1 / num2;
			System.out.println(total);
		}
	}

}
