package com.demo.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.project.entity.Customer;
import com.demo.project.repository.CustomerRepository;
import com.demo.project.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
