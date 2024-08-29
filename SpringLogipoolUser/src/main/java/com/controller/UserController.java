package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.model.User;
import com.service.UserService;
import com.service.UserServiceImpl;

@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	UserServiceImpl userService;
	
	@PostMapping("/addUser")
	public User addUse(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/getUserById/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	

	@GetMapping("/getUserByName/{name}")
	public User getUserByName(@PathVariable String name) {
		return userService.getUserByName(name);
	}
	
	
	
//	@PutMapping("/updateUser/{id}")
//	public User updateUser(@RequestBody User user, @PathVariable int id) {
//		return userService.updateUser(user, id);
//	}
	
	
}
