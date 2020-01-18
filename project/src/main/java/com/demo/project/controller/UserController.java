package com.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.entity.User;
import com.demo.project.service.CustomerService;
import com.demo.project.service.ProductService;
import com.demo.project.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	ProductService productService;

	@Autowired
	CustomerService customerService;

	@GetMapping("/getAllUsers")
	public ResponseEntity<List<User>> getAllUsers() {
		HttpHeaders headers = new HttpHeaders();
		List<User> data = userService.findAll();
		return new ResponseEntity<List<User>>(data, headers, HttpStatus.OK);
	}

	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(HttpRequest httpRequest, @RequestParam("userName") String userName, @RequestParam("password") String password, @RequestParam("email") String email, @RequestParam("contactNo") String contactNo) {
		HttpHeaders headers = new HttpHeaders();
		User newUser = new User();
		newUser.setName(userName);
		newUser.setPassword(password);
		newUser.setEmail(email);
		newUser.setContactNo(contactNo);
		User data = userService.saveUser(newUser);
		return new ResponseEntity<User>(data, headers, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<User> loginUser(HttpRequest httpRequest, @RequestParam("userName") String userName, @RequestParam("password") String password) {
		HttpHeaders headers = new HttpHeaders();
		if (null != userName && null != password) {
			User data = userService.login(userName, password);
			headers.add("success", "Login Successfully");
			return new ResponseEntity<User>(data, headers, HttpStatus.OK);
		} else {
			User data = new User();
			headers.add("error", "Login Failed. Enter correct UserName and Password");
			return new ResponseEntity<User>(data, headers, HttpStatus.BAD_REQUEST);
		}
	}
}