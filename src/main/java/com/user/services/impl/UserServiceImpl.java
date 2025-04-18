package com.user.services.impl;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.exception.ResourseNotFoundExe;
import com.user.helper.ChangePassword;
import com.user.repo.UserRepository;
import com.user.services.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	
	
	@Override
	public User createUser(User user) {
		
		User getUser=this.userRepo.findByEmail(user.getEmail())  ;
		
		if( getUser == null)
			return userRepo.save(user);
		
		 return null;
	}

	
	
	@Override
	public User updateUser(User user) {  // new user data

	    User updatedUser = this.userRepo.findByEmail(user.getEmail());

	    if (updatedUser != null) {
	    	
	        updatedUser.setFirstName(user.getFirstName());
	       updatedUser.setLastName(user.getLastName());
	        updatedUser.setPassword(user.getPassword());

	        updatedUser = this.userRepo.save(updatedUser);  
	    }
	    return updatedUser;
	}

	
	
	public User getByEmail(String e)
	{
		return this.userRepo.findByEmail(e);
	}
	
	
	
	
	public User getUserByEmailAndPassword(String email,String password )
	{
		return this.userRepo.findByEmailAndPassword(email, password);
	}
	
	
	
	@Override
	public User deleteUser(String email,String pass) {
	
		User user=this.userRepo.findByEmailAndPassword(email, pass);
		if(user != null)
			this.userRepo.delete(user);
		return user;
	}
	

	// optional Api's
	
	@Override
	public User getUserById(Integer id) {

		User user=this.userRepo.findById(id).orElseThrow(()->new ResourseNotFoundExe("User Not Found with Id- ", id));
		return user;
	}
	
	
	@Override
	public List<User> getAllUsers() {
		return this.userRepo.findAll();
	}

	
	
	public List<User> createMultipleUsers( List<User> users )
	{	
		Set<String> emails = this.userRepo.findAll().stream().map(u->
		u.getEmail()).collect(Collectors.toSet());
		
		List<User> uniqueUsers= users.stream().filter(u->u.getEmail()!=null && 
				!emails.contains(u.getEmail() )).collect(Collectors.toList());
		
		this.userRepo.saveAll(uniqueUsers);
		
		return uniqueUsers;
	}


	
	@Override
	public User changePassword( ChangePassword obj ) {
		
		User user = this.userRepo.findByEmailAndPassword(obj.getEmail(),obj.getOldPassword() );
		
		if( user != null )
		{
			user.setPassword( obj.getNewPassword() );
			this.userRepo.save(user);
		}
		return user;
	}



	@Override
	public List<User> SeerchUsersByFirstName(String firstName) {
		
		return this.userRepo.findAll().stream().
				filter((u)-> u.getFirstName().toLowerCase().equalsIgnoreCase(firstName)).collect(Collectors.toList());
	}
}














