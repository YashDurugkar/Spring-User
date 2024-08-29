package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserRepository;

import com.model.User;
@Service
public class UserServiceImpl {
	
	

	@Autowired
	UserRepository userRepo;

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	public List<User> getList() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	public User getUserById(int id) {
		return userRepo.findById(id).orElse(null);
	}
	
	public User getUserByName(String name) {
		return userRepo.findByName(name);
	}
	
	
	
	
	
//	public User updateUser(User user, int id) {
//		// TODO Auto-generated method stub
//		User existingUser=userRepo.findById(id).orElse(null);
//		
//		if(existingUser!=null) {
//			existingUser.setName(user.getName());
//			existingUser.setName(user.getName());
//			existingUser.setCity(user.getCity());
//			existingUser.setAge(user.getAge());
//		}
//		else {
//			System.out.println("Record is Null.");
//		}
		
//		return userRepo.save(existingUser);
//	}
//
//	
//	public List<User> addUsers(List<User> users) {
//		// TODO Auto-generated method stub
//		return userRepo.saveAll(users);
//	}
	
	}

	


