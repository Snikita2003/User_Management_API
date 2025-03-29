package com.user.helper;

import javax.validation.constraints.NotBlank;

public class ChangePassword {


	@NotBlank(message = "Email is required")
	String email;
	
	@NotBlank(message = "Old password is required")
	String oldPassword;
	
	@NotBlank(message = "new password is required")
	String newPassword;

	public ChangePassword() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChangePassword(@NotBlank(message = "Email is required") String email,
			@NotBlank(message = "Old password is required") String oldPassword,
			@NotBlank(message = "new password is required") String newPassword) {
		super();
		this.email = email;
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	
	
	
	
}
