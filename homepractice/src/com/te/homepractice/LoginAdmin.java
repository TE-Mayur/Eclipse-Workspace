package com.te.homepractice;

public class LoginAdmin {

	public void login(String user, String paswsd) {
		
		if(user.equalsIgnoreCase("admin")) {
			if (paswsd.equalsIgnoreCase("admin321")) {
				System.out.println("Login Successfull ");
			}else {
				throw new InvalidCredentialException ("Wrong password");
			}
		}else {
			throw new InvalidCredentialException ("Wrong Credentials");
		}
		
}
}