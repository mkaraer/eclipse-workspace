package day37_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDefinition {
public static void main(String[] args) {
	//List <String> longName=new ArrayList<>(); == ArrayList <String> longName=new ArrayList<>();   
	//ArrayList <String> longName=new ArrayList<>(10);  you can limit but it isnot fixed size it can be increade anytime
	
	//*** ArrayList <Integer> newList =new ArrayList<>(oldList); 
	//will create an arraylist by initializin using values from oldList.
	
	//int[] nums= {123,34,23,656};
	//ArrayList <Integer> numsList =new ArrayList<>(nums); 
	
	//List <String> cities=new Arrays.asList(new String[]) {"Tokya","London"});
	
	//How to ADD elements to ArrayList
	
//	1.add(value)
//	2.add(index,object/value)
//	list.add("beijing");
	//list.add(0,123.4);
	
	//listOfChars.add(2,'C');
	
	//ADDALL (ANOTHERLIST)
	//list1.addAll(list2);
	
	//ADDALL(index,AnotherList)
	//will append(attach) starting from that index
	//list.addAll(5,list2);
	
	//REMOVE ELEMENTS
	
	//clear()
//list.clear()
	
	//2. remove(index)=== remove value specified elements 
	 // list.remove(5)
// 3. remove(Objects)=== remove first specified value
	
	// list.remove("london");
	// removeAll(AnotherLit);
	//list1.removeAll(list2); ====will remove all matching elements beetwen list1 and list2
	
	//check if it is empty== list.isEmpty== returns boolean
	//list.size()==0-----returns boolean-- how many elemnt-- int number of elements
	
	//how to chcek if a list contains a certain valur
	// list.contains("Bostan");
	//cities.contain("boston")====== true|false
	
	//how to find posrition of a value in a list
	
	// index(object/value)
	// cities.indexOf("austin")===5
	
	// lastIndexOf(object/value)
	
	//how to uptade an element in a certain index?
	  //list<String> languages=new ArrayList<>():
	//languages.add("C++");
	//anguages.add("C#");
	//anguages.add("objective C");
	//anguages.add("java");
	
	//set(index,object/value);
	
	//i want to update C# to Pyton
	
	//languages.set(1,"Pyton");  go to index 1 change the value to Pyton
	
	
	// Array is a fixed sized, appart of core java programming
	// arraylist dynamic and collection frame work
	
	//we can only store object types in arraylist
	//
}
}
