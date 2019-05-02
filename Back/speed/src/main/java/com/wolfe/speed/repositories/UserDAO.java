package com.wolfe.speed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wolfe.speed.beans.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

	public User getByUserid(int userid);

	public User getByUsername(String username);

}
