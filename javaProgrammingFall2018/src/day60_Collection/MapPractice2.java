package day60_Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice2 {
public static void main(String[] args) {
	
Map<Long,String> mt = new HashMap<>();
	
	mt.put( 1L, "Yesil");
	mt.put( 2L, "mavi");
	mt.put( 3L, "mavi");
	mt.put( 4L, "kirmizi");
	mt.put( 5L, "sari");
	
	System.out.println(mt);
	
	Set<Long>allkeys=mt.keySet();  // prints only the value of Long
	System.out.println(allkeys);
	
	Collection<String>values=mt.values();
	System.out.println(values);
	
	
	
	
	
	
	
}
}
