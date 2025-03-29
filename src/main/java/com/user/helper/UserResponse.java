package com.user.helper;

import com.user.entity.User;

public class UserResponse {
	
	Integer code;
	String message;
	User data;
	
	
	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserResponse( Integer code, String message, User data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data ;
	}
	
	public UserResponse( String message,Integer code ) {
		super();
		
		this.message = message;
		this.code = code;
	}
	
	
	public Integer getCode() {
		return code;
	}

	public void setCode( Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return data;
	}

	public void setUser(User data) {
		this.data = data;
	}
	
	
}
