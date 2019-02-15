package com.training.day3.collection;

import java.util.ArrayList;

public class CollectionEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		// ArrayList<Object> list = new ArrayList<Object>(); 
		
		
		list.add("Hi"); 
		list.add("Bye"); 
		list.add(true); 
		list.add(new Object()); 
		list.add(100); 
		
		System.out.println(list);
		
		for(Object temp : list) {
			System.out.println(temp);
		}
		
	}
}
