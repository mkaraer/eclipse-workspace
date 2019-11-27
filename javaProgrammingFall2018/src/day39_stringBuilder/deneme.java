package day39_stringBuilder;

public class deneme {
public static void main(String[] args) {
	
int[]c= {1,2,3,4,5,6,7,6,5,4,3,2,1};
for(int d:c) {
	System.out.println(getStarts(d));
}
//	System.out.println(getStarts());
	
}
	public static String getStarts(int count) {
		String stars="";
		for(int i=1; i<count; i++) {
			
			stars+="*";// add one more star	
				
				}
		return stars;
	}
	
	
	
	
	

}
