package com.wolfe.speed.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolfe.speed.beans.User;
import com.wolfe.speed.service.AuthService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

	private AuthService authService;

	@Autowired
	public LoginController(AuthService authService) {
		super();
		this.authService = authService;
	}

	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(value="/attemptLogin")
	public ResponseEntity<User> LoginRequest(@RequestBody User userAndPass){
			return new ResponseEntity<>(authService.authUser(userAndPass), HttpStatus.OK);	
	}
}
