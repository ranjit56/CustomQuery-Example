package com.CustomQuery.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CustomQuery.Entity.Customer;
@Service
public interface CustomerSer {
	
	public Customer createCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	
	public List<Customer> getCustomer(String customerName);
	
	public Customer getCustomer(Long id);


	Boolean deleteCustomer(Long id);

}
