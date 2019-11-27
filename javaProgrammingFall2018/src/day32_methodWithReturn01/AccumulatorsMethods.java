package day32_methodWithReturn01;

public class AccumulatorsMethods {
public static void main(String[] args) {
	
	//System.out.println(getStarts(7));
	int sumToN=0;
	int[] start= {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};
	
	for(int n:start) {
		System.out.println(getStarts(n));
		//System.out.println(n);
		
		
	}	

	}
			
	
	


public static String getStarts(int count) {
	String stars="";
	for(int i=1; i<count; i++) {
		
		stars+="*";// add one more star	
			
			}
	return stars;
}
// method sumTon: accepts an int and return sum of int starting from 1 to that int
//sumToN(3)--6 (1, 2+3)
//sunToN(5)--15 (1+2+3+4+5)

public static int sumToN(int[] start) {
	int sum=0;
	
	for(int i=1; i<=start.length; i++) {
		sum+=start[i];
		
		}
	
	return sum;
}







}
