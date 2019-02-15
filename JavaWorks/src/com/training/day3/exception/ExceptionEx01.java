package com.training.day3.exception;

public class ExceptionEx01 {
	public static void main(String[] args) {
		try {
			int res ; 
			int num1 = Integer.parseInt(args[0]); 
			int num2 = Integer.parseInt(args[1]);
			try {
				int [] arr = new int [10];
			}catch(NegativeArraySizeException nase) {
				nase.printStackTrace();
			}
			
			res = num1 / num2; 
			System.out.println("Result " + res);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}finally {
			System.out.println("Hi i'm from finally ");
		}
		
		System.out.println("This is some other business logic ");
	}
}
