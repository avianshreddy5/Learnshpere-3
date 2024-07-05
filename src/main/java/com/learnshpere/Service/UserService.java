package com.learnshpere.Service;

import com.learnshpere.Entity.Users;

public interface UserService {
	// to add user
	public String adduser(Users user);

//to check email
	boolean checkEmail(String email);

	// validate user crendentialls
	boolean validate(String email, String password);

	// getting user role
	String getUserRole(String email);

}
