package day27_arrays;

public class splitA_rray {
	public static void main (String[] args) {
		
		String words="java-selenium-cucumber-testing-junit-eclipse-maven-git-gitHub";
		
		String[] splittedWords =words.split("-");
		System.out.println(splittedWords.length);
		System.out.println(splittedWords[0]);
		
		for(String w :splittedWords) {
			System.out.print(w);
		}
		
		String searchResults= "All categories wooden spoon 13.623 Results";
		
		// if you have a sentence how many words are there
		
		String [] arrResults=searchResults.split(" ");
		
		System.out.println("wordd count "+arrResults.length);
		System.out.println(searchResults.split(" ").length);
		System.out.println(searchResults.split(" ")[0]);
		System.out.println("wooden spoon count "+arrResults[4]);
		
		// extract number of 
		
		
		
		
		
		
		
		
		
		
	}
}
