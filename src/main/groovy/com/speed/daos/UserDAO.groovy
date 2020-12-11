package com.speed.daos

import com.speed.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserDAO extends JpaRepository<User, Integer>{
    User getByUserid(int userId)
    User getByUsername(String username)
}
