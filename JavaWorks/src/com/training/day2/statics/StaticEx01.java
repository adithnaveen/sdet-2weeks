package com.training.day2.statics;

public class StaticEx01 {
	
	static int si = 100; 
	// the static methods are loaded in the stack even before 
	// main is loaded and only once 
	public static int add(int num1, int num2) {
		return num1 + num2; 
	}
	
	static {
		System.out.println("hey i'm from static block 01, val is " + si ) ;
		si = si + 200; 
	}
	
	static {
		System.out.println("i'm 02 static block ");
	}
	
	public static void main(String[] args) {
	
		int sum = add(10, 10); 
		System.out.println(sum);
		
		int sum1 = add(100, 200); 
		System.out.println(sum1);
		
		System.out.println( "SI value is : "+si);
	}
	
	
	static {
		System.out.println("I'm last static block ");
	}
}
