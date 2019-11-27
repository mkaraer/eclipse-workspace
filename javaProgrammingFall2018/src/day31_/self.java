package day31_;

import java.util.Scanner;

public class self {
	public static void main (String[] args) {
	Scanner input=new Scanner (System.in);
	System.out.println("enter the number");
	double n1=input.nextInt();
	double n2=input.nextInt();
	//double n1=0;
	//double n2=0;
	double result=0;	
		add(n1,n2);
		subtract(n1,n2);
		multi(n1,n2);
		divide(n1,n2);
		System.out.println("chose oprataions\n"+
				 "1- add\n"+
				 "2 subtract\n"+
				 "3-multiplication\n"+
				 "4 divide\n");
          	 int operations=input.nextInt();
////				   switch(operation) {
////				   case 1:
////				   add(n1,n2);
////				   break;
////				   case 2:
////					   subtract(n1,n2);
////					   break;
////				   case 3:
////					   multi(n1,n2);
////					   break;
////				   case 4:
////					   divide(n1,n2);
////					   break;
////					   default:
////					   System.out.println("invalit eror");	   
////				   }
		
		
		if( operations==1) {
	          
	          
	           add(n1,n2);
               
              
              } else if( operations==2) {
   	           subtract(n1,n2);
   	       
   
              }else if( operations==3) {
   	           multi(n1,n2);
   
              } else if(operations==4) {
   	           divide(n1,n2);
   	        
   }
                 
                 
	}
		public static void add(double n1, double n2) {
			double result=n1+n2;
			System.out.println(result);
		}
		
		public static void subtract(double n1, double n2) {
		  double	result=n1-n2;
			System.out.println(result);
		}
		public static void multi(double n1, double n2) {
		 double	result=n1*n2;
			System.out.println(result);
		}
			public static void  divide(double n1, double n2) {
		double	result=n1/n2;
			System.out.println(result);

		}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


