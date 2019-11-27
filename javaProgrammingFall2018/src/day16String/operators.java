package day16String;

public class operators {
		public static void main (String[] args) {
			
//			operators:
//				aritmetic operators: +,-/,%
//				shorthand assignment: +=,_=,/=,
//				increment/decrement: --,++
//			   comprasion: >,>==,<,<==,==,!=
			
//			distance in miles,pace (speed per hour) 
//			how min it takes to reach destination
			double distance=50;
			double pace= 5;
			
			
			double min= distance/pace*60;
			
			
			System.out.println(min);
			// if you spend 5 min in traffic
			min+=5.0;
			// you spend 1 minute extra coz you took a wrong turn
			min++;
			
			System.out.println(min);
			
			int number=10;
			System.out.println(number/3);
			System.out.println(number%3);
			
			System.out.println(number);
			++number;// add one
			System.out.println(number);
			number++;// add 1
			System.out.println(number);
			
			int num2= number++;// for the next step add 1
			System.out.println(num2); //28
			System.out.println(number);//15
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	
		}		}
