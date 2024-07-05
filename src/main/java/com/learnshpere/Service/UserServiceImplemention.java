package com.learnshpere.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.learnshpere.Entity.Users;
import com.learnshpere.Repository.UserRepository;

@Service
public class UserServiceImplemention implements UserService {
	@Autowired
	UserRepository Urepo;

	@Override
	public String adduser(Users user) {
		Urepo.save(user);
		return "User added successfully";
	}

	@Override
	public boolean checkEmail(String email) {
		return Urepo.existsByEmail(email);
	}

	@Override
	public boolean validate(String email, String password) {

		if (Urepo.existsByEmail(email)) {
			Users U = Urepo.getByEmail(email);
			String dbpassword = U.getPassword();
			if (password.equals(dbpassword)) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

	@Override
	public String getUserRole(String email) {
		Users u = Urepo.getByEmail(email);
		return u.getRole();
	}
}
