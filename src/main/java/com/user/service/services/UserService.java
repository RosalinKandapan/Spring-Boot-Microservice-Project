package com.user.service.services;

import java.util.List;

import com.user.service.entities.User;

public interface UserService {
	
	//create
	User saveUser(User user);
	
	//get all User
	List<User> getAllUser();
	
	//get single user of given userId
	User getUser(String Id);
	
	//delete
	String deleteUser(String Id);
	
	//updateUser
	User updateUser(User user);

}
