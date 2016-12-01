package com.opas350.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.opas350.model.Customer;


@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${someProperty}")
	private String someValue;
	
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer.setFirstName(someValue);
		customer.setLastName("Z");
		
		customers.add(customer);
		
		return customers;
	}
}
