package com.training.day5.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteEx {
	public static void main(String[] args)  {
		BufferedReader br = null; 
		FileWriter fw = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in)); 
			
			System.out.println("Enter Id ");
			int id = Integer.parseInt(br.readLine()); 
			
			System.out.println("Enter Name ");
			String name = br.readLine(); 
			
			System.out.println("Enter Income ");
			double income = Double.parseDouble(br.readLine()); 
			
			System.out.println("---------------------------");
			System.out.println("Emp Id " + id);
			System.out.println("Emp Name " + name);
			System.out.println("Income " + income);
			
			File f = new File("sample.txt"); 
			fw = new FileWriter(f, true); 
			
			fw.write("Emp Id: " + id  );
			fw.write("Emp Name: " + name  );
			fw.write("Emp Income: " + income+"\n");
			
		}catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
		System.out.println("Contents written ");
		
		
		
	}
}
