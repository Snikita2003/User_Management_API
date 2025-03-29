package com.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.user.helper.UserResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler( ResourseNotFoundExe.class)
	public ResponseEntity< UserResponse > resNotFoundExpHandler( ResourseNotFoundExe ex)
	{
		String msg=ex.getMessage();
		UserResponse apiResponce=new UserResponse( "Not found user " ,HttpStatus.NOT_FOUND.value()  );
		return new ResponseEntity<UserResponse>(apiResponce , HttpStatus.NOT_FOUND );
		
	}

}
