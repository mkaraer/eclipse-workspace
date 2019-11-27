package day60_Collection;

import java.util.*;

public class MapHashMapExcell {
	public static void main(String[] args) {
		
		Map<String , List<String>> groupMap=new HashMap<>();
		
		List<String> ty1Lst= Arrays.asList("Heydar","Ahhmed");
		List<String> ty2Lst= Arrays.asList("Esqer","Oguz");
		List<String> ty3Lst= Arrays.asList("Dhamol","Mesut","Ali","Hsan");
		
		groupMap.put("Tyson One", ty1Lst);
		groupMap.put("Tyson two", ty2Lst);
		groupMap.put("Tyson three", ty3Lst);
		
		System.out.println(groupMap.get("Tyson three"));
		System.out.println(groupMap.get("Tyson three").get(1));
		
// we want to create a map that contains city as key and coordinates as value
		//vienna, 23.12-109.56
		
//		Map<String, Map<Double,Double>> cityCordMap= new HashMap<>();
//		
//		 Map<Double,Double> cod1= new HashMap<>();
//		     cod1.put(11.00, 23.11);
//		     
//		     cityCordMap.put("Vienna", cod1);
		
//Stimulate excell reading  by row and by column
		//we need to be able to go row ... index list
		//we need to be able to go to column... so we can get value
		
		List<Map<String,String>> excelSheet=new ArrayList<>();
		
		Map<String,String> excelMap= new HashMap<>();
		excelMap.put("A", "Adam");		 
		excelMap.put("B", "25");
		excelMap.put("C", "Male");
		   excelSheet.add(excelMap);
		
		Map<String,String> excelMap1= new HashMap<>();
		excelMap1.put("A", "John");		 
		excelMap1.put("B", "22");
		excelMap1.put("C", "male");
		   excelSheet.add(excelMap1);
		 
		Map<String,String> excelMap2= new HashMap<>();
		excelMap.put("A", "Mary");		 
		excelMap.put("B", "25");
		excelMap.put("C", "Female");
		   excelSheet.add(excelMap2);
		
		System.out.println(excelSheet);
		
		System.out.println(excelSheet.get(1).get("A"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
