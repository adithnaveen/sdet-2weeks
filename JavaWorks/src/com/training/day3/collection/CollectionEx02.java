package com.training.day3.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionEx02 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); 
		
		list.add("Adarsh"); 
		list.add("Siby"); 
		list.add("Shree"); 
		list.add("DeWayne"); 
		list.add("Kevin"); 
		
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println("Number of elements " + list.size());
		
		System.out.println(list);
		
		// copy elements from 0-3 to another list 
		List<String> subList =  list.subList(0, 3); 
		subList.set(2, "New Element"); 
		
		System.out.println("Sub list is " + subList);
		
		
		list.clear();
		System.out.println(list);
		
		/*Iterator<String> itr = list.iterator(); 
		
		while(itr.hasNext()) {
			String temp = itr.next(); 
			System.out.println(temp.toUpperCase().substring(0, 3));
		}
		*/
		
	}
}









