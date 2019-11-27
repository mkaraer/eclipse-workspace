package day36_ArraysList;

import java.util.ArrayList;

public class ArrayListGeneral {
public static void main(String[] args) {
	
	//create a genrnal arraylist
	//we can add any value of data to this int,double,string,boolean
	ArrayList list=new ArrayList();
	
	list.add("java");
	list.add("eclips");
	list.add("slack");
	list.add(456);
	list.add(true);
	
	System.out.println(list);
	
	list.add(345.2);
	list.add('_');
	System.out.println(list);
	//to get the first one--java--
	System.out.println(list.get(0));  //--java--
	
	System.out.println(list.size());//7
	
	
	//2.way crete Restiricted type. for ex.Arraylist that can only store string objects or only ints tec
	//ArrayList<String>names= new Arraylist<String>();
	////ArrayList<String>names= new Arraylist();
	
	
	
	
	
	
	
}
}
