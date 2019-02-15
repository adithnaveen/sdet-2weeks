package com.training.day2.poly;

public class Toyota extends Vehicle{
	private int fuelCapacity; 
	private int noOfDoors; 
	
	
// when you create an object of this class, you have to pass 2 params 
	public Toyota(int fuelCapacity, int noOfDoors) {
		super();
		this.fuelCapacity = fuelCapacity;
		this.noOfDoors = noOfDoors;
	}
	
	public void fuelCapacity() {
		System.out.println("Toyota Has Fuel Capacity " + fuelCapacity);
	}
	public void noOfDoors() {
		System.out.println("Toyota Built with " + noOfDoors  +" doors");
	}

	
	
	
	@Override
	public void move() {
		System.out.println("Toyota is moving ");
	}

	@Override
	public void stop() {
		System.out.println("Toyota is stopping ");
	}

	@Override
	public String toString() {
		return "Toyota [fuelCapacity=" + fuelCapacity + ", noOfDoors=" + noOfDoors + "]";
	}
	
}
