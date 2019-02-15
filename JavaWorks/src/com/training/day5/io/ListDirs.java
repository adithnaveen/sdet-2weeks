package com.training.day5.io;

import java.io.File;

public class ListDirs {
	public static void main(String[] args) {
		File f = new File("dir"); 
		
		if(f.isDirectory()) {
			System.out.println(f.getName() +", is directory");
			
			String [] contents = f.list(); 
			
			for(String temp : contents ) {
				File ff = new File(f, temp); 
				if(ff.isFile()) {
					System.out.println(ff.getName());
				}
				/*if(ff.isDirectory()) {
					System.out.println(ff.getName());
				}*/
			}
			
		}
	}
}
