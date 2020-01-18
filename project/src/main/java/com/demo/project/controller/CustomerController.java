package com.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.entity.Customer;
import com.demo.project.service.CustomerService;
import com.demo.project.service.ProductService;
import com.demo.project.service.UserService;

@RestController
public class CustomerController {

	@Autowired
	UserService userService;

	@Autowired
	ProductService productService;

	@Autowired
	CustomerService customerService;

	@GetMapping("/getAllCustomers")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		HttpHeaders headers = new HttpHeaders();
		List<Customer> data = customerService.findAll();
		return new ResponseEntity<List<Customer>>(data, headers, HttpStatus.OK);
	}
}
