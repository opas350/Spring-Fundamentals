package com.opas350.service;

import java.util.List;

import com.opas350.model.Customer;
import com.opas350.repository.CustomerRepository;
import com.opas350.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
