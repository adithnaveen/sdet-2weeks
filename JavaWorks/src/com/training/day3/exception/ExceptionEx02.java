package com.training.day3.exception;

public class ExceptionEx02 {

	public static void validateName(String name) throws NameTooSmallException {
		if (name.length() < 3) {
			throw new NameTooSmallException("Car Name " + name + " is small please enter valid");
		}
	}

	public static void speed(String carName, int speed) throws OverSpeedException, 
		Exception{
		try {
			validateName(carName);
	
		
			if (speed < 45) {
				System.out.println("All good with Car " + carName);
			} else if (speed >= 45 && speed < 65) {
				System.out.println("You are trying to overspeed Caution!!! " + carName);
			} else {
				throw new OverSpeedException("You got a ticket for overspeeding " + carName);
			}
		}catch(NameTooSmallException ntse) {
			throw new Exception("Sorry Spee Method not execute", ntse);
		}
	}

	public static void main(String[] args) {
		try {
			speed("B", 75);
		} catch (OverSpeedException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("hey i m some other business logic ");
	}
}
