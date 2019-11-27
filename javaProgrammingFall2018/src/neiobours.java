
public class neiobours {
	public static void main (String[] args) {
		//String word and you need to check for sama character sid by side 
		//if you found say baap 
		
		String word="aabbccd";
		
	
		for(int i=0; i<word.length()-1; i++){
			//System.out.println(word);
			
			//if (word.charAt(i)==word.charAt(i+1)) {
			//	System.out.println("  beep "+ word.charAt(i));
			
			if(word.substring(i,i+1).equals(word.substring(i+1,i+2))){
			
				System.out.println("  beep "+word.substring(i,i+1));
			
			}
		}
		
		
		
		
		
		
		
	}
}
