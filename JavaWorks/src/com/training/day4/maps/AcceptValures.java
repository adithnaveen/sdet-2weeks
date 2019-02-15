package com.training.day4.maps;

import java.util.Scanner;

public class AcceptValures {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter your Name ");
		String name = sc.nextLine();
		
		System.out.println("Enter your salary ");
		double salary = sc.nextDouble(); 
		
		System.out.println("Your Name is " + name);
		System.out.println("Your salary is " + salary);
		
	}
}
