package day09_conditions;
import java.util.Scanner;
public class shippingCalculator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Shipping Calculator");
		System.out.println("enter purchace Price:");
		double purchasePrice  = scan.nextDouble();
		
		boolean shippingMode=true;
		double shippingPrice=0.0;
		
		
		if(purchasePrice>1&&purchasePrice <100) {
			if(shippingMode=true) {
				shippingPrice=17;
			}else {
				purchasePrice=35;
			}
		}else if(purchasePrice>101&& purchasePrice<300) {
			if(shippingMode=true) {
				shippingPrice=10;
			}else {
				purchasePrice=25;
			}
		}else if (purchasePrice>=300) {
			if(shippingMode=true) {
				shippingPrice=0.0;
			}else {
				purchasePrice=15;
			}
		}
		System.out.println("shipping price:"+shippingPrice);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
