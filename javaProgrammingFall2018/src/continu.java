
public class continu {
	public static void main (String[] args) {
		for(int k=0; k<=10; k++) {
		if (k==1 || k==2) {
			continue;
		}
		//System.out.println("value of k "+ k);
		}	
		//loop through numbers from 1=50
		// print each number in same line ,separated by space
		// if a number divisible by 5 then skip it
		// if a number visible by 20 exit the looop
		
		for (int i=1; i<=50; i++) {
			
			if(i%5==0) {
				continue;
				
			}
			if(i%2==0) {
				break;
			}
				System.out.print(" "+i);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

