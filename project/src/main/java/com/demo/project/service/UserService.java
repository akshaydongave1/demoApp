package com.demo.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.project.entity.User;

@Service
public interface UserService {

	List<User> findAll();

	User saveUser(User user);

	User login(String userName, String password);

}
