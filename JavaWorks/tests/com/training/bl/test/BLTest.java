package com.training.bl.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.training.bl.BusinessLogic;

public class BLTest {

	BusinessLogic bl = null;
	
	@Before
	public void setUp() {
		System.out.println("Hey Im in before ");
		bl = new BusinessLogic(); 
	}
	
	@After
	public void tearDown() {
		System.out.println("Hey I m in After ");
	}
	
	@Test
	public void test() {
		// assert 
		// will be return value 
		boolean flag = false; 
		assertTrue(flag);
	}

	@Ignore
	@Test
	public void sayHiTest() {
		
		String name = "Venkat"; 
		String retVal = bl.sayHi(name);

		assertEquals("Hello " + name, retVal);
	}
	
	@Test
	public void updateRecordTest() {
		
		String recordValue = "Sample"; 
		String retVal = bl.updateRecord(recordValue);
		
		assertEquals("Updated " + recordValue, retVal);
	}
	
	
	
	@Test
	public void updateRecordFailTest() {
		
		String recordValue = "Sample"; 
		String retVal = bl.updateRecord(recordValue);
		
		assertEquals(recordValue, retVal);
	}
	
	
	@Test(timeout=500)
	public void updateRecordTimeTest() {

		String recordValue = "Sample"; 
		String retVal = bl.updateRecord(recordValue);
		
		assertEquals("Updated " + recordValue, retVal);
	}
	
	
	
	
	
}
