package day19_loops02;

public class snackTime {
	public static void main (String[] args) {
		// create a boolean variable hungry and assign true
		//create int variable app;es and assign 1 to it
		//As long as your hungry pritn "eating an apple"
		// and increase the apple
		// once you eat 5 apple, youare longer hungry

		
		boolean hungry=false;
		int apple=1;
		while(hungry) {
			System.out.println("eating an apple");
		  
		  
		 if (apple==5) {
			  hungry=false;
		  }else { // saglama yapmak icin
			  
		  }
		
		}
		System.out.println("Total Apple "+ apple); // else ait..
		
		
		
		boolean a=returnMonkey(false,true);
		
		System.out.println(a);
		
		
		
	}
	public static boolean returnMonkey(boolean aSmile,boolean bSmile) {
		
		if(aSmile==true&&aSmile==true||aSmile==false&&bSmile==false) {
			return true;
		}else{
			return false;
			
		}
		
		
		
	}
}
