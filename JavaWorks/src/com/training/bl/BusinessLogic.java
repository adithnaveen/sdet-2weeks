package com.training.bl;

// single 
// developers comment 

/**
 * 
 * @author Naveen
 * @since Feb 2019 
 * @see Sample work
 */
public class BusinessLogic {
	public boolean insertRecord() {
		// this has to be with DB 
		return true; 
	}
	
	public String sayHi(String name) {
		return "Hello " + name; 
	}
	
	/**
	 * 
	 * @param record
	 * @return
	 */
	public String updateRecord(String record) {
		System.out.println("Record Updating " + record); 
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "Updated " + record; 
	}
	
}
