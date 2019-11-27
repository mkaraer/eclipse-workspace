package day14_;

public class subString {
	public static void main(String[] args)  {
		//SubString gets part of a string
		// there are 2 versions, 1 takes 1int, 1takes 2 ints
		// if it takes 1 int, it meas starting point
		
		String str= "01234";
		System.out.println(str.substring(3)); // it counts after number 3  ==System.out.println(sentence.indexOf("y",5)); // 14 it startting letter 5
		
		String str1 = "donaldtheduck@gmail.com";
		System.out.println(str1.substring(14)); // gmail
		
		System.out.println(str1.substring(0,2)); // do
		System.out.println("abc".substring(1,2));// icindeki abc icin calisir..
		
		
		
	}
}
