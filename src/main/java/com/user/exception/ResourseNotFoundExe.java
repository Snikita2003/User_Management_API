package com.user.exception;

public class ResourseNotFoundExe extends RuntimeException{

	String msg;
	Integer userId;
	
	public ResourseNotFoundExe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourseNotFoundExe(String msg, Integer userId) {
		super( String.format("%s ", msg , userId ) ) ;
		this.msg = msg;
		this.userId = userId;
	}
	
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	
	
}
