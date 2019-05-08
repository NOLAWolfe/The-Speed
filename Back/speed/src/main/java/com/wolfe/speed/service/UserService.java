package com.wolfe.speed.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wolfe.speed.beans.User;
import com.wolfe.speed.repositories.UserDAO;

@Service
public class UserService {
	
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public List<User> findAllUsers() {
		return userDAO.findAll();
	}
	
	public User getUserById(int id) {
		return userDAO.getByUserid(id);
	}
	
	public void createUser(User user) {
		userDAO.save(user);
	}
}
