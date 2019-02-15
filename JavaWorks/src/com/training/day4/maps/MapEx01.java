package com.training.day4.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx01 {
	public static void main(String[] args) {
//		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		TreeMap<String, Integer> map = new TreeMap<String, Integer>(); 
		
		// you can even the object 
		map.put("Venkat", 20000); 
		map.put("Tripti", 23000); 
		map.put("Mike", 24000); 
		map.put("Alfanso", 25000); 
		
		
		System.out.println("Balance of Mr. Venkat :" + map.get("Venkat"));
		System.out.println("Balance of Mrs. Tripti " + map.get("Tripti"));
		
		map.put("Venkat", 30000);

		System.out.println("Balance of Mr. Venkat :" + map.get("Venkat"));
		
		
		Set set = map.entrySet(); 
		
		Iterator itr = set.iterator(); 
		
		while(itr.hasNext()) {
			
			Map.Entry temp = (Entry) itr.next(); 
			System.out.println("Key : " + temp.getKey() +", Value : " + temp.getValue());
			 
		}
		
		
		
		
		
		
		
		
		
	}
}
