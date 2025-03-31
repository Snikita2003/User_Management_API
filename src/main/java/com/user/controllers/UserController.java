package com.user.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.helper.ChangePassword;
import com.user.helper.UserResponse;
import com.user.services.impl.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	
	@PostMapping
	public UserResponse createUser(@RequestBody User user)
	{
		User getUser = this.userServiceImpl.createUser(user);
		if( getUser != null) 			 					// user email not present, then add new user.
			return new UserResponse(HttpStatus.OK.value(),"success",getUser  );
		                 									// user found with same emailid-( conflict same email id )
		return new UserResponse("Email already exists",409 );
	}
	
	
	
	
	@PostMapping("/get")
	public UserResponse getUserByEmailAndPassword(@RequestBody User user)
	{
		
		User getUser = this.userServiceImpl.getUserByEmailAndPassword(user.getEmail(), user.getPassword());
		
		if( getUser != null )        			   // found user by email,password
			return new UserResponse( HttpStatus.OK.value(),"success", getUser  );
												// not. found user by email,password
		return new UserResponse( "Invalid Crediential " ,HttpStatus.NOT_FOUND.value() );	
	}
	
	
	
	
	@PutMapping
	public UserResponse updateUser(@RequestBody User newUser )
	{
		 User updatedUser = this.userServiceImpl.updateUser(newUser);
		if( updatedUser != null )
		 {
			return new UserResponse( HttpStatus.OK.value(),"updated", updatedUser  );	 
		 }
		
		return new UserResponse("not updated" ,  HttpStatus.NOT_FOUND.value() );
	}
	

	
	
	// http://localhost:8080/users?email=harry@gmail.com&pass=harry1234
	
	@DeleteMapping
	public UserResponse deleteUser(@RequestParam String email,  @RequestParam String pass)
	{
		User user=this.userServiceImpl.getUserByEmailAndPassword(email, pass);
		if( user != null)
		{
			User deletedUser = this.userServiceImpl.deleteUser(email, pass);

			return new UserResponse(HttpStatus.OK.value(),"User deleted", deletedUser );
		}
		return new UserResponse("User not present", HttpStatus.NOT_FOUND.value() );
	}
	
	
	
	
	
	// Additional API's
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers()
	{
		List<User> users = this.userServiceImpl.getAllUsers();
		return ResponseEntity.ok( users );
	}
	
	
	
	@GetMapping("/getById/{id}")
	public UserResponse getUserById( @PathVariable Integer id )
	{
		User getUser = this.userServiceImpl.getUserById(id);
		
		if( getUser != null )
			return new UserResponse(HttpStatus.OK.value() , "success", getUser  );
		return new UserResponse(  "Not found Id", HttpStatus.OK.value() );
	}
	
	
	
	
	@PostMapping("/")
	public  ResponseEntity<List<User>> createMultipleUsers(@RequestBody List<User> users )
	{
		List<User> storedUsers = this.userServiceImpl.createMultipleUsers(users) ;
		return ResponseEntity.ok(storedUsers);
		
	}
	
	
	
	@PostMapping("/get/changePass")
	public UserResponse changePassword( @RequestBody ChangePassword obj )
	{
		
		User user=this.userServiceImpl.changePassword(obj);
		if( user != null )
		{
			return new UserResponse(HttpStatus.OK.value(),"Changed Password successfully", user);
		}
		return new UserResponse( "Not Changed,Invalid Email or Password !!", HttpStatus.NOT_FOUND.value() );
	}
	
	
	
	@GetMapping("/{firstName}")
	public ResponseEntity<List<User>> SerachUsersByFirstName(@PathVariable String firstName)
	{
		return ResponseEntity.ok(  this.userServiceImpl.SeerchUsersByFirstName(firstName)  );
	}

}
