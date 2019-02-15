package com.training.day3.interfaces;

import java.util.Arrays;

public class SortEx01 {
	public static void main(String[] args) {
		String [] arr = {"Siby", "Shree", "Sudha", "Ann", "Abby"};
		
		Arrays.sort(arr);
		
		for(String temp : arr) {
			System.out.println(temp);
		}
	}
}
