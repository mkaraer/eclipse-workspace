package day36_ArraysList;

public class overloadedMethods {
	public static void main(String[] args) {
	System.out.println(add(1,2));

		System.out.println(add(1,2,3));
	System.out.println(playGame("derby",11));	
	
	System.out.println(playGame("football",11));
	System.out.println(playGame(9,"voleyball"));
	
	System.out.println(work("developer"));
	System.out.println(work(6));
	
	}
	/*
     * method: playGame
     * 1. name:playGame
     * param:int,string
     * return: boolean
     * 
     *  method: playGame
     * 1. name:playGame
     * param:string,int
     * return: boolean
     * 
     * gamename,numberOfPlayers
     * Print playing[game] with [that many]players
     * if number of players more>=2 then return true
     */
    
    public static boolean playGame(String game,int players) {
//   	 String gameName="";
//   	 int numberOfPlayers=0;
    	System.out.println("playing>"+game+">with>"+players+">players>");
    	
   	 return players>=2;
    }
    
    public static boolean playGame(int players,String game) {
    	System.out.println("playing>"+game+">with>"+players+">players>");
    	
      	 return players>=2;
       }
	
	
	/*
	 * 2 method: add
	 * 1 st: add
	 * params 2 ints
	 * return :int
	 * 
	 * 
	 * 2nd: add
	 * params: 3 doubles
	 * return double
	 */
		
		public static int add(int n1, int n2) {
			return n1+n2;
			
		}
		
	     public static double add(double d1, double d2, double d3) {
			return d1+d2+d2;
		}
	
    
	
	
	

     
	/*
	 * method: work
	 * 1.params: string job types
	 * returns boolean  if job sdet or developer then true else false
	 * print working as <jobType> and it is fun
	 * 
	 * 2.params int hours
	 * return double-- salary: hours*60
	 * print work >this many >hours and made >that much> income
	 * 
	 */
	
     public static boolean work(String jobTypes) {
//    	 if(jobTypes.equals("developer")){
//    		return true; 
//    	 }else {
//    		 return false;
//    	 }
    	 System.out.println("working as "+jobTypes+" and it is fun");
          return jobTypes.equalsIgnoreCase("sdet")||jobTypes.equalsIgnoreCase("developer") ;
          
     }
     public static double work(int hours) {
    	 double salary=hours*60;
    	 System.out.println("worked this salary "+hours +" and that much income");
          return salary;
	
     }
	
	
}
