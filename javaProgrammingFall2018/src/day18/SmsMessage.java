package day18;
import java.util.Scanner;
public class SmsMessage {
	public static void main (String[] args) {
		
//		String SMSmessage= new String("Sender: <Mike Smith>. from Number :[202-123-3456].args Message: {I love programming and problem solving}");
//		String sender, phoneNumber,message;
//		sender= SMSmessage.substring(SMSmessage.indexOf("<")+1,SMSmessage.indexOf(">"));
//		System.out.println(sender);
//		 phoneNumber= SMSmessage.substring(SMSmessage.indexOf("[")+1,SMSmessage.indexOf("]"));
//		
//		 System.out.println(phoneNumber);
//		 message=SMSmessage.substring(SMSmessage.indexOf("{")+1,SMSmessage.indexOf("}"));
//		 System.out.println(message);
//		
		
		
//		
//		String sender= "mike Smith";
//		int number= 2021233456;
//		String message= "I love programming and problem solving";
//		System.out.println(message.substring(2));
//		System.out.println(sender.indexOf(0));
//		System.out.println(sender+"sends textmessage " message);
		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("Enter the cars");
//		String garage= scan.next();
		// contain method\
		// indexof metod==2
		
		
		String garage= "Toyota,Nisssan,Honda,Bmw,Mazerati,Ford";
		garage= garage.toLowerCase();
		System.out.println(garage);
		
		if(garage.isEmpty()) {
			System.out.println("no cars");
		
			if (garage.contains("toyota")|| garage.contains("honda")){
			System.out.println("in garage terhere are japanese cars");
		}else {
			System.out.println("in garage terhere are NO japanese cars");
		}
			
			if(garage.indexOf("bmw")>-1) {
				System.out.println("there is German car");
				
			}else {
				System.out.println("there isNO German car");
			}
			if(garage.indexOf("mazerati")>-1) {
				System.out.println("there is italian car");
			}else {
				System.out.println("there isNo Italian car");
			}
		
		
		
		
		
		
		
		
		
		
		}
	}
}
