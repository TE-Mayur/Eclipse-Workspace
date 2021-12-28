package com.te.exceptions.throwtest;

public class LoginToAdmin {

	public void login(String user, String pwd) {
		
		if(user.equalsIgnoreCase("admin")) {
			if(pwd.equalsIgnoreCase("admin123")) {
				System.out.println("logged in succesfully");
			}else {
				throw new InvalidCredentialsException("Wrong Password");
			}
		}else {
			throw new InvalidCredentialsException("Wrong Credentials");
		}
	}
}
