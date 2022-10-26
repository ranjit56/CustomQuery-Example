package com.CustomQuery.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.CustomQuery.Entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

	@Query("SELECT c from customerDetails c where c.customerName=?1")
    List<Customer> findByCustomerName(String customerName);
}
