package com.demo.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.project.entity.Product;
import com.demo.project.repository.ProductRepository;
import com.demo.project.service.ProductService;

public class ProductServiceIMpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}
}
