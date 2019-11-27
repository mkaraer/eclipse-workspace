



package day33_methodwithReturn;



public class StringMethods02 {
public static void main(String[] args) {
	
	//System.out.println(counTimes("javac","c"));
	//TODO uptade the method
	System.out.println(counTimesV2("javacc","cc"));
	
	
	
	
	//System.out.println(	counTimes("hih","hih tell me when you say Hih that you feel good saying hih"));
	
	
}
//	Method name: counTimes
//	params: 2 String
//	Return: int
//	count number of occurences of first string within second string
//	and return taht count
//			
//			ex:
//				counTimes ("java","a",) return 2
//				counTimes("Break time is over!","e")--3
//				counTimes("google","a")--0
	public static int counTimes(String str1,String str2) {
		
		
		int count=0;
		for(int i=0; i<str1.length(); i++) {
			if(str1.substring(i,i+1).equals(str2)){
			//if(str1.substring(i,str1.length()-1).equalsIgnoreCase(str2)) {	
			
			
			//if(str2.charAt(i)=='h'||str2.charAt(i)=='H') {
			//	if(i+str1.length()<=str2.length()&&str2.substring(i,i+str1.length()).equalsIgnoreCase(str1)) {
					count++;
				}
		}
	return count;
	
	
	}
	
	// 2 way. String str= "abcabc"; str.split("b");-- ["a","ca","c"]--- length--3.b are 2
	public static int counTimesV2(String str1,String str2) {
	String[] arr= str1.split(str2);
	return arr.length;
	
	}
	// 3 way
	//"java","a"
	public static int counTimesV3(String str1,String str2) {
		int len1=str1.length();//4
		str1=str1.replace(str2, "");
		int len2=str1.length();//2
		return len1-len2;
	}
	
	
	
	
}

