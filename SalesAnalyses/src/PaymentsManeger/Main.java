package PaymentsManeger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Beans.Location;
import Beans.MyDate;
import Beans.Payment;
import Beans.Product;
import Beans.Visa;

public class Main {
	public static void main(String[] args) throws IOException {
		
//		Payment payment1= new Visa();
////   1/2/09 4:53,  Product1,  1200,  Visa, Betina, Parkville   ,MO,United States
//		payment1.setTransactionDate(new MyDate(1,2,2009)); //......>**** we create new because they are class
//		payment1.setProduct(new Product("Product1"));
//		payment1.setPrice(1200);
//		payment1.setType("Visa");
//		payment1.setName("carolina");
//		payment1.setLocation(new Location("Parkville","MO","USA"));
//		
//		// tostring method
//		//System.out.println(payment1.toString());
//		
//		PaymentController paymentController = new PaymentController();
//		
//		paymentController.addPaymentRecord("1/4/09 12:56,Product2,3600,Visa,Gerd W ,Cahaba Heights ,AL,United States");
//		
//		System.out.println(paymentController.payments.get(0).toString());
//		//to read data from csv file
//		
//		BufferedReader br=new BufferedReader(new FileReader("/Users/Yolcu/Downloads/SalesJan2009.csv"));
//		
//		System.out.println(br.readLine()); //Bufferreader line by line reader
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		
//		String line="";
//		while((line=br.readLine() )!=null){
//			System.out.println(line);
//		}
		
		PaymentController p= new PaymentController();
		p.loadDataFromCVSFile("/Users/Yolcu/Downloads/SalesJan2009.csv");
		for(Payment payment:p.payments) {
			System.out.println(payment.toString());
		}
		
		
	}

}
