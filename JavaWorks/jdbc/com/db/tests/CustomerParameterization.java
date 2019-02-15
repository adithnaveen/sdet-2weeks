package com.db.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.db.dao.CustomerDAO;
import com.db.entity.Customer;

@RunWith(Parameterized.class)
public class CustomerParameterization {
	
	@Parameters
	public static List<Customer> init() {
		return new CustomerDAO().getAllCustomers(); 
	}
	
	private Customer customer; 

	public CustomerParameterization(Customer customer) {
		this.customer  = customer;
	}
	
	@Test(timeout=100)
	public void sayHiTest() {
		System.out.println(customer.getCustEmail());
		assertEquals(this.customer.getCustEmail(), this.customer.getCustEmail());

	}
	
}