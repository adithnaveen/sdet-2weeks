package com.training.day2.interfaces;

public class Client {
	public static void main(String[] args) {
		IShape shape; 
		
		shape = new Square(10); 
		shape.area(); 
		
		System.out.println("-----------------------------");
		shape = new Rectangle(10, 20); 
		shape.area(); 

		System.out.println("-----------------------------");
		shape = new Cube(10, 20, 30); 
		shape.area(); 
	}
}