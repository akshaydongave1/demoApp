package com.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.entity.Product;
import com.demo.project.service.CustomerService;
import com.demo.project.service.ProductService;
import com.demo.project.service.UserService;

@RestController
public class ProductController {

	@Autowired
	UserService userService;

	@Autowired
	ProductService productService;

	@Autowired
	CustomerService customerService;

	@GetMapping("/getAllProducts")
	public ResponseEntity<List<Product>> getAllProducts() {
		HttpHeaders headers = new HttpHeaders();
		List<Product> data = productService.findAll();
		return new ResponseEntity<List<Product>>(data, headers, HttpStatus.OK);
	}
}
