package com.demo.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.project.entity.Product;

@Service
public interface ProductService {

	List<Product> findAll();

}
