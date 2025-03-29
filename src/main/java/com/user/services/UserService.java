package com.user.services;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.helper.ChangePassword;


public interface UserService {
	
	
	public User createUser(User user);
	public User deleteUser(String email,String password);
	public User getUserById(Integer id);
	public User updateUser( User user );
	
	public List<User> getAllUsers();
	public List<User> createMultipleUsers(List<User> users );
	public User changePassword( ChangePassword obj );
	
	
	
	
	
	
	

}
