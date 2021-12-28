package com.te.homepractice;

public class Abcd {

		public void login(String user, String paswrd) {
			if(user.equalsIgnoreCase("admin")) {
				if(paswrd.equalsIgnoreCase("admin123")) {
				System.out.println("Login Succesfull");
				}else {
					throw new InvalidCredentialException("Wrong password");
				}
			}else {
				throw new InvalidCredentialException("Wrong credentials");
			}
			
		}
}
