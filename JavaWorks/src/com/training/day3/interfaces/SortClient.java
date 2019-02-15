package com.training.day3.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class SortClient {
	public static void main(String[] args) {
		Mobile [] mobiles = {
				new Mobile("Apple", 2300, 5), 
				new Mobile("Samsung", 2200, 6), 
				new Mobile("OnePlus", 3300, 7), 
				new Mobile("Infocus", 1000, 4) 
		}; 
		
		for(Mobile temp : mobiles) {
			System.out.println(temp);
		}
		
		Arrays.sort(mobiles);
		System.out.println( " ----------- After Sorting ---------------");
		for(Mobile temp : mobiles) {
			System.out.println(temp);
		}
	}
}
