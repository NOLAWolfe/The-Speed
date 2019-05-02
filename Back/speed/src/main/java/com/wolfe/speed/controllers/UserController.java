package com.wolfe.speed.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolfe.speed.beans.User;
import com.wolfe.speed.repositories.UserDAO;

@RestController
@RequestMapping(value="/api")
public class UserController {

	private UserDAO ud;
	
	@Autowired
	public void setUserDAO(UserDAO ud) {
		this.ud = ud;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<>(ud.findAll(), HttpStatus.OK);
	}
}
