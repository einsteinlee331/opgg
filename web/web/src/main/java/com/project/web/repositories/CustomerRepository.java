package com.project.web.repositories;


import com.project.web.entities.Customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CustomerRepository
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	public Customer findByCustomerIdAndPassWord(String CustomerId, String PassWord);
	public Customer findByCustomerId(String CustomerId);
}