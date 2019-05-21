package com.wolfe.speed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolfe.speed.beans.User;

@Service
public class AuthService {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User authUser(User userAndPass) {

		String username = userAndPass.getUsername();
		String password = userAndPass.getPassword();

		User userPers = userService.findUserByUsername(username);
		
		try {

			if (userPers.getUsername().equals(username) && userPers.getPassword().equals(password)) {
				return userPers;
			}

		} catch (Exception e) {
			System.out.println("Invalid Username & password");
		}
		return null;
	}
	
}
