package com.training.day2.interfaces;

public class Cube extends Rectangle implements IShape{
	private int depth; 
	
	public Cube(int len, int bre, int depth) {
		super(len, bre); 
		this.depth = depth; 
	}

	@Override
	public void area() {

		System.out.println("Area of Cube " + (len * bre * depth));
	}
	
	
	
}
