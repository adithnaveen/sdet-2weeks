package com.training.day3.collection;

import java.util.HashSet;

public class CollectionEx04 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>(); 
		
		set.add("Laptop"); 
		set.add("Mouse"); 
		set.add("Key Board"); 
		set.add("Charger");
		System.out.println(set.add("Computer"));
		System.out.println(set.add("Computer"));
		System.out.println(set.add("Computer"));
		System.out.println(set.add("Computer"));


		for(String temp : set) {
			System.out.println(temp);
		}

		
	}
}
