package com.training.day2.poly;

// the super class can hold the reference of sub class 
// vice-versa is not allowed, if so need to typecast 
public class Client {
	public static void main(String[] args) {
		// v is a reference 
		Vehicle v; 
		
		v = new Toyota(80, 4); 
		v.move();
		v.stop(); 
		((Toyota)v).noOfDoors();
		((Toyota)v).fuelCapacity();
		
		System.out.println("---------------------------------");

		v = new ManTruck(8000); 
		v.move();
		v.stop();
		((ManTruck)v).printCapacity(); 
	}
}
