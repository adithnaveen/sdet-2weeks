package com.statics.test;

public class Client {
	public static void main(String[] args) {
		try {
			Class.forName("com.statics.test.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
