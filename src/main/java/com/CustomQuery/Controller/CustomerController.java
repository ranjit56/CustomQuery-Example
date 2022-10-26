package com.CustomQuery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CustomQuery.Entity.Customer;
import com.CustomQuery.Service.CustomerSer;



@RestController
@RequestMapping("/Customer")
public class CustomerController {

	@Autowired
	private CustomerSer customerSer;

	@PostMapping("/Save")
	public Customer createCustomer(Customer Customer) {
		return customerSer.createCustomer(Customer);
	}

	// Updates the resource
    @PutMapping("/update")
	public Customer updateCustomer(Customer Customer) {
		return customerSer.updateCustomer(Customer);
	}

	// Retrive the resource
	@GetMapping("/get")
	public Customer getCustomer(Long id) {
		return customerSer.getCustomer(id);

	}
	@GetMapping("/getCustomer/{customerName}")
	public List<Customer> findByCustomerName(@RequestParam String customerName) {
		return customerSer.getCustomer(customerName);
	}
	// Delete the resource
	@DeleteMapping("/delete")
	public Boolean deleteById(Long id) {
		return customerSer.deleteCustomer(id);
	}
	
}
