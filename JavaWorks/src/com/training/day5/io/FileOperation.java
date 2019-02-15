package com.training.day5.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		
		// file will hold only reference 
		// it does not create file 
		File f = new File("sample.txt");
		System.out.println("Seperator " + File.separator);
		if(f.exists()) {
			System.out.println("File Already Present ");
			System.out.println("Can be written " + f.canWrite());
			System.out.println("Can read " + f.canRead());
			System.out.println("Last modified " + new Date(f.lastModified()));
			f.setWritable(true); 
		}else {
			System.out.println(f.createNewFile() 
					?"File created.. " :"Sorry not created");
		}
		
	}
}
