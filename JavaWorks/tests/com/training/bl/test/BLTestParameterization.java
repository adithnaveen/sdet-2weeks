package com.training.bl.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.training.bl.BusinessLogic;

@RunWith(Parameterized.class)
public class BLTestParameterization {
	
	@Parameters
	public static Iterable<String[]> init() {
		return Arrays.asList(
			new String[][] {
				{"Kevin", "Hello Kevin" }, 
				{"Shree" , "Hello Shree"}, 
				{"Ibzan", "Hello Ibzan"}
		}); 
	}

	private String name; 
	private String expectedName; 
	
	public BLTestParameterization(String name, String expectedName) {
		this.name = name; 
		this.expectedName = expectedName; 
	}
	
	static BusinessLogic bl  = null;
	@BeforeClass
	public static void setUpBeforeClass() {
		bl = new BusinessLogic(); 
	}
	
	@Test
	public void sayHiTest() {
		String retVal = bl.sayHi(this.name);
		assertEquals(this.expectedName, retVal);

	}
	
}
