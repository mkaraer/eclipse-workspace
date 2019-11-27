package day24_;

import java.util.Scanner;

public class multiplicatioTable {
	public static void main (String[] args) {
		//Scanner input=new Scanner(System.in);
		//System.out.println("----------------");
	//	int count=input.nextInt();
		
		for (int outer=1; outer<=10; outer++) {
			//System.out.println("--------------");
		for(int inner=1; inner<=10; inner++) {
				int result=outer*inner;
				System.out.println("| "+outer+" x "+inner+" = "+result+"\t |");
				
					
		}
		System.out.println("--------------");
		}
		
	}
}
