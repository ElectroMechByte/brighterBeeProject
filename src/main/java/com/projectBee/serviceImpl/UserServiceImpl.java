package com.projectBee.serviceImpl;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.projectBee.model.Role;
import com.projectBee.model.User;
import com.projectBee.repository.RoleRepository;
import com.projectBee.repository.UserRepository;
import com.projectBee.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	 
	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
		
	}

	@Override
	public void saveUser(User user) {

		    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	        user.setActive(true);
	        Role userRole = roleRepository.findByRole("ADMIN");
	        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
	        userRepository.save(user);
	        
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub

	}

}
