package com.user.service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.entities.User;
import com.user.service.exception.ResourceNotFoundException;
import com.user.service.repositories.UserRepository;
import com.user.service.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		String randomUID = UUID.randomUUID().toString();
		user.setUserId(randomUID);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(String Id) {
		
		return userRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException());
	}

	@Override
	public String deleteUser(String Id) {
		
		 userRepository.deleteById(Id);
		 return "userDeleted";
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

}
