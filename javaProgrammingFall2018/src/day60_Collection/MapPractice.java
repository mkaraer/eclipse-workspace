package day60_Collection;

import java.util.*;
import java.util.Map;

public class MapPractice {
public static void main(String[] args) {
	
	Map<String,Integer>ct= new HashMap<>();
	
	ct.put("USA", 28);
	ct.put("UK", 20);
	ct.put("Ukranina", 17);
	ct.put("France", 25);
	
	//ct.put("France", 100); cant be dublicate.. must be unique
	System.out.println(ct);
	//Crud opretion ... create , read/Retrieve, update,Delet
	
	System.out.println(ct.get("USA"));
	
	ct.replace("France", 50);
	System.out.println("new france count: "+ct.get("France"));
	
	ct.remove("France");
	System.out.println(ct);
	
	/*
	 * Create a map of long ,sttring to represent
	 * product ID and product name
	 * add 5 items, try to add dublicate and see what happens
	 * update second product
	 * remove last product
	 * 
	 * print out each time you do a change
	 */
	Map<Long,String> mt = new HashMap<>();
	
	mt.put( 1L, "Yesil");
	mt.put( 2L, "mavi");
	mt.put( 2L, "mavi");
	mt.put( 4L, "kirmizi");
	mt.put( 5L, "sari");
	
	System.out.println(mt);
	
	mt.replace(2L, "blue");
	System.out.println(mt);
	
	mt.remove(5L);
	System.out.println(mt);
	

	
	
	
	
	
	
	
}
}
