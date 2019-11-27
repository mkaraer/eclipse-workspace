import java.util.Scanner;

public class passwordValidator {
	public static void main(String[] args)  {
	
		Scanner scan= new Scanner (System.in);
	System.out.println("Enter a nwe password; ");
	String entry= scan.nextLine();
	int password= entry.length();
	
	boolean isPassword= entry.length()>=8;
	boolean isUpperCase=entry.contains()>=1;
	boolean isLowerCase= entry.contains()>=1;
	boolean specialCharacter= entry.contains()>=1;
	
		if(isPassword&& isUpperCase && isLowerCase && specialCharacter  )	{
			System.out.println("valid "+isPassword + isUpperCase + isLowerCase + specialCharacter );
		} else {
			System.out.println("invalid ");
		}
	
	
	
	
	
	
	
	
	
		 }
	}
	
