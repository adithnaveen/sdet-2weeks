package com.training.day5.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOEx {

	public static void storeMobile(MobileBean mobile) {

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mobile.ser")); 
			
			oos.writeObject(mobile);
			oos.writeInt(100);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("Data Stored Successfully");
		
		
	}
	public static MobileBean  getMobile() {
		
		MobileBean mobile = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mobile.ser")); 
			
			int val = ois.readInt();
			mobile = (MobileBean) ois.readObject();
			System.out.println("Int value " + val);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return mobile; 
	}
	
	public static void main(String[] args) {
		MobileBean mobile = new MobileBean("Apple", 789, 5); 
	// 	storeMobile(mobile);
		
		MobileBean mobileRead = getMobile(); 
		System.out.println(mobileRead);
	}
}










