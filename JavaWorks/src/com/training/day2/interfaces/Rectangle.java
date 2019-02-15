package com.training.day2.interfaces;

public class Rectangle extends Square implements IShape {

	protected int bre; 
	
	
	public Rectangle(int len, int bre) {
		super(len); 
		this.bre = bre;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle is " + (super.len * bre));
	}

}
