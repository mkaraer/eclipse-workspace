package day60_Collection;

import java.util.*;

public class WarmUpMap {
public static void main(String[] args) {
	
	String [] arr= {"Darben","Hitzke","Lamburn","Secretan","Cawswe","kalem","lale","Zack"};
	List<String> lst= new ArrayList<>();
	for(String eachName:arr) {
		lst.add(eachName);
	}
	System.out.println(lst);
	
	Iterator<String> myIt= lst.iterator();
	
	while(myIt.hasNext()) {
		
		System.out.print(myIt.next());
	}
	
	
	SortedSet<String> srt=new TreeSet<>(lst);
	System.out.println(srt); // sort
	System.out.println(srt.size()); //unique
	
	SortedSet<String> kSet=srt.subSet("K", "Z"); //starts from k to q
	kSet.remove("Lale");
	System.out.println(kSet);
	System.out.println(lst);
	
	Map<String ,Integer> FMap=new HashMap<>();
	
	System.out.println(FMap.containsKey("ABC"));
	
	for(String name: lst) {
		if(! FMap.containsKey(name)) {
			FMap.put(name, 1);
			
		}else {
			Integer existingCount= FMap.get(name);
			FMap.put(name, existingCount+1);
		}
	}
	
	System.out.println(FMap);
	
	
	
	
}
}