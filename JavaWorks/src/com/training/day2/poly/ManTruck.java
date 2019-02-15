package com.training.day2.poly;

public class ManTruck extends Vehicle {
	private int capacity;

	public ManTruck(int capacity) {
		super();
		this.capacity = capacity;
	}

	public void printCapacity() {
		System.out.println("Truck Capacity " + capacity);
	}

	@Override
	public void move() {
		System.out.println("Man Truck is Moving");
	}

	@Override
	public void stop() {
		System.out.println("Man Truck stop");
	}

	@Override
	public String toString() {
		return "ManTruck [capacity=" + capacity + "]";
	}

}
