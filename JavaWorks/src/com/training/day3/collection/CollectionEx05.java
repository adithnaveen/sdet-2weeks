package com.training.day3.collection;

import java.util.HashSet;

public class CollectionEx05 {
	public static void main(String[] args) {
		HashSet<Watch> watches = new HashSet<>(); 

		watches.add(new Watch("Timex", 2200)); 
		watches.add(new Watch("Fossil", 2100)); 
		watches.add(new Watch("Rolex", 2300)); 
		watches.add(new Watch("Swatch", 3200)); 
		watches.add(new Watch("Swatch", 3200)); 
		watches.add(new Watch("Swatch", 3200)); 
		watches.add(new Watch("Swatch", 3200));
		
		for(Watch temp : watches) {
			System.out.println(temp +", hashcode -> " + temp.hashCode());
		}
		
	}
}
