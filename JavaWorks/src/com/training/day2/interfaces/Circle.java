package com.training.day2.interfaces;

public class Circle implements IShape{

	private int radius; 
	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}


	@Override
	public void area() {
		System.out.println("Area of Circle " + (pi *radius * radius));
	}

}
