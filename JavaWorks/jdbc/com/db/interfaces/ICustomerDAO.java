package com.db.interfaces;

import java.util.List;

import com.db.entity.Customer;

public interface ICustomerDAO {
	public boolean insertCustomer(Customer customer); 
	
	public boolean deleteCustomer(int custId);
	
	public boolean updateCustomerIncome(int custId, double income);
	// i'll give 10 % hike 
	public boolean updateCustomerIncomeAndEmail(int custId, String email); 
	
	public Customer getCustomer(int custId); 
	
	public List<Customer> getAllCustomers(); 
	
}