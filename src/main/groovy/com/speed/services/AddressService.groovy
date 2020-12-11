package com.speed.services

import com.speed.daos.UserDAO
import com.speed.models.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AddressService {
    UserDAO userDAO

    @Autowired
    void setUserDAO(UserDAO userDAO) { this.userDAO = userDAO}

    List<User> findAllUsers(){ userDAO.findAll()}
    User getUserById(int id) { userDAO.getByUserid()}
    void createUser(User user) { userDAO.save(user)}
    User findUserByUsername(String username) {userDAO.getByUsername()}

}
