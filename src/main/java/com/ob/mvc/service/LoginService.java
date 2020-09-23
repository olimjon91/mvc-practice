package com.ob.mvc.service;

public class LoginService {
	
	public boolean isValidUser(String username, String password) {
		return username.equalsIgnoreCase("olim") && password.equalsIgnoreCase("dammy");
	}

}
