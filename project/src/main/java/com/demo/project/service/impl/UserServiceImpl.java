package com.demo.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.project.entity.User;
import com.demo.project.repository.UserRepository;
import com.demo.project.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User login(String userName, String password) {
		return userRepository.findByUserNameAndPassword(userName,password);
	}
	
	
}
