package com.training.day3.collection;

import java.util.Stack;
import java.util.Vector;

// to show working of vectors 
public class CollectionEx03 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<>(7, 5);
		
		System.out.println("Number of elements " + list.size());
		System.out.println("Capacity of vecto " + list.capacity());
		
		list.add("1"); 
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		list.add("11");
		list.add("11");
		list.add("11");
		
		System.out.println(list);
		System.out.println("Number of elements " + list.size());
		System.out.println("Capacity of vecto " + list.capacity());
		


		
		
		
	}
}
