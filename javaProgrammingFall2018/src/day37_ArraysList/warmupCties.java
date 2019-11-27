package day37_ArraysList;

import java.lang.*;
import java.util.ArrayList;;

public class warmupCties {
public static void main(String[] args) {
	
	//create an arraylist
	//print count of cities in the list
	//print all cities in one line seperated byspace
	//create another arraylist longNames
	//and all cities from list with more than 6 characters into longNames list
	
	
	ArrayList <String> cities=new ArrayList<>();
	
	cities.add("istanbul");
	cities.add("VIrdinia");
	cities.add("0,Malataya");
	cities.add("viyana");
	cities.add("1,van");
	cities.add("Raleigh");
	cities.add("edirna");
	cities.add("dushanbe");
	cities.add("almaty");
	cities.add("burdur");
	cities.add("finix");
	cities.add("osh");
	cities.add("tashkent");
	cities.add("baku");
	cities.add("bursa");
	
	System.out.println(cities);
	System.out.println(cities.size());
	
	for(String c:cities) {
		System.out.print(c);
	}
	System.out.println();
for (int i = 0; i < cities.size(); i++) {
	System.out.println(cities.get(i)+" | ");
}
	
ArrayList <String> longName=new ArrayList<>();   	   
// each loop  
for(String city:cities) {
	   if(city.length()>6) {
		   longName.add(city);
	   }
   }
	
	System.out.println(longName);
	longName.clear(); // cleans array
	System.out.println(longName.isEmpty()+" "+(longName.size()==0));
	
	//for loop
	for (int idx = 0; idx < cities.size(); idx++) {
		
		if(cities.get(idx).length()>6) {
			   longName.add(cities.get(idx));
		}
	}
	
	System.out.println(longName.size());
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
