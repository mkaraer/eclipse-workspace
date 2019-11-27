
public class uniqueChar {
	public static void main (String[] args) {
		//print only unique characters
		String word="java";
		
		String unique="";
		
		for(int i=0; i<word.length(); i++) {
			//System.out.print(word.substring(i,i+1));
			if(!unique.contains(word.substring(i,i+1))){
				unique+=word.substring(i, i+1);
			}
		}
		System.out.print(unique);
		
		
		
		
		
		
		
		
		
	}
}
