package com.projectBee.service;

import com.projectBee.model.User;

public interface UserService {

	public User findUserByEmail(String email);
	
	public void saveUser(User user);
	
	public void deleteUser(int id);
}
