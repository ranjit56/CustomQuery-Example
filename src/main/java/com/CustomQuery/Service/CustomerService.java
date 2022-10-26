package com.CustomQuery.Service;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomQuery.Entity.Customer;
import com.CustomQuery.Repository.CustomerRepository;


@Service
public class CustomerService implements CustomerSer{

	@Autowired
	 CustomerRepository customerRepository;


	@Transactional
	// the metadata that specifies the semantics of the transactions on a method.
	// used to combine more than one writes on a database as a single atomic
	// operation.
	public Customer createCustomer(Customer customer) {

		return customerRepository.saveAndFlush(customer);
	}

	@Transactional
	public Customer updateCustomer(Customer customer) {

		return customerRepository.saveAndFlush(customer);
	}

	@Transactional
	public Customer getCustomer(Long id) {

		return customerRepository.findById(id).orElse(null);
	}

	@Transactional
	public Boolean deleteCustomer(Long id) {
		Boolean flag = false;
		if(id == 0) {
			throw new IllegalArgumentException("Id can't be null");
		}else {
			Customer entity = getCustomer(id);
			customerRepository.deleteById(id);
			return flag;
		}
	}
	@Transactional
	public List<Customer> getCustomer(String customerName) {
		return customerRepository.findByCustomerName(customerName);
	}

	
}
