package com.opas350.repository;

import java.util.ArrayList;
import java.util.List;

import com.opas350.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.opas350.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Mr. opas");
		customer.setLastName("Z");
		
		customers.add(customer);
		
		return customers;
	}
}
