package day43_static_constructur;

import java.awt.List;
import java.util.*;

public class FoodTester {
public static void main(String[] args) {
	Random random=new Random();
    double d =random.nextInt(1000000000);
    double d1 =random.nextInt(1000000000);
    double d2 =random.nextInt(1000000000);
    System.out.println(d);
	Food food1=new Food("banana",12.5,"amazon");
	 System.out.println(food1.getName()+"|"+food1.getPrice());
	     
	
	food1.setBrand("etcy");
	
	Food food2= new Food();
	ArrayList <Food> foods=new ArrayList<>();
	for(int i=0; i<10;i++) {
		foods.add(new Food(""+d,d1,""+d2));
		System.out.println(foods.get(i).getName());
		System.out.println(foods.get(i).getPrice());
		System.out.println(foods.get(i).getBrand());
		
	}
	
	
	

	
	
	
	
	
}	
}
