package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
	User addUSer(User user);
	List<User>getList();
	User updateUser(User user, int id);
	
	List<User> addUser(User users);
	
	User getUserById(int id);
	User getUserByName(String name);
	
	
}
