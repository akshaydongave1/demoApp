package com.demo.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.project.entity.Customer;

@Service
public interface CustomerService {

	List<Customer> findAll();

}
