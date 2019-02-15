package com.training.day2.interfaces;

public class Square implements IShape{

	protected int len;

	public Square(int len) {
		super();
		this.len = len;
	}

	@Override
	public void area() {
		System.out.println("Area of Square: "+ (len * len));
	} 
	
	
}
