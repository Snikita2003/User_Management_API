package com.user.helper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.user.entity.User;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class UserResponse {
	
	private Integer code;
	private String message;
	private User data;
	
	
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
