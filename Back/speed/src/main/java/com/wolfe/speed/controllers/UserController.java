package com.wolfe.speed.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolfe.speed.beans.User;
import com.wolfe.speed.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {

	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<>(userService.findAllUsers(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{username}")
	public ResponseEntity<User> getUserByUsernmae(@PathVariable String username){
		return new ResponseEntity<>(userService.findUserByUsername(username), HttpStatus.OK);
	}
	
	@GetMapping(value="/id/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable String userId){
		int id = Integer.parseInt(userId);
		return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
	}
}


