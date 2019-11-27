package day28_;

public class ibrahim2 {
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * String word="hello"; String rev=""; int count=word.length()-1;
		 * 
		 * while(count>=0) {
		 * 
		 * //for (int i = word.length()-1; i>=0; i--) {
		 * rev+=word.substring(count,count+1); count--;
		 * 
		 * 
		 * 
		 */

		// }

		// System.out.println(rev);

		String s1 = "metin_karaer@hotmail.com";
		String firstName = "";
		String lastName = "";
		String domain = "";
		String topLevelDomain = "";
		// firstName : Craig lastName: Warren
		// domain: gmail
		// topLevelDomain: com

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '_') {
				firstName = s1.substring(0, i);
				for (int j = 0; j < s1.length(); j++) {
					if(s1.charAt(j)=='@') {
						lastName=s1.substring(i+1,j);
						for (int j2 = 0; j2 < s1.length(); j2++) {
							if(s1.charAt(j2)=='.') {
								domain=s1.substring(j+1,j2);
								topLevelDomain=s1.substring(j2+1);
							}
							
						}
					}

				}
			}

		}
		System.out.println("firstName: "+firstName.substring(0,1).toUpperCase()+firstName.substring(1));
		System.out.println("lastName: "+lastName.substring(0,1).toUpperCase()+lastName.substring(1));
		System.out.println("domain: "+"@"+domain);
		System.out.println("topLevelDomain: "+topLevelDomain);
		
		
		
		String[]array= {"osman","ali","ekmek"};
		/*
		 * 
	
		for(String arr:array) {
			System.out.println(arr.substring(0,1)+arr.substring(arr.length()-1));
		}
			 */
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].substring(0,1)+array[i].substring(array[i].length()-1));
			
		}
	
		
		
		
		
		
		
		
		
		

	}
}