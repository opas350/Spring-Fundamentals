package com.opas350.repository;

import java.util.List;

import com.opas350.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}