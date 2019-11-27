package day60_Collection;

import java.util.*;
import java.util.Map.Entry;

public class Practice4 {
public static void main(String[] args) {
	
	String[] arr= {"Apple","Lemon","Mango","Ayse","Hilal","Hilal"};
	List<String> lst=new ArrayList<>();
	
	for(String each:arr) {
		lst.add(each);
	}
System.out.println(lst);

Iterator<String> it= lst.iterator();
while(it.hasNext()) {
	System.out.print(it.next());
}
SortedSet<String> unq= new TreeSet<>(lst);

System.out.println(unq);
System.out.println(unq.size());	
	
SortedSet<String> sortSet=	unq.subSet("K", "P");
System.out.println(sortSet);
	
Map<String,Integer > name= new HashMap<>();
for (int i = 0; i < lst.size(); i++) {
	name.put(lst.get(i), lst.get(i).length()); 
}
	System.out.println(name);
	
	Set<String> set= name.keySet();
	
	Set< Entry<String,Integer> > entrySetview= name.entrySet();
	Iterator<Entry<String, Integer>> setIte= entrySetview.iterator();
	
	//List<String> lst=new ArrayList<>();
	
	
	
	
	
	
	
	
	
	
	
}
}
