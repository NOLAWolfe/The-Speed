package com.speed.services

import com.speed.models.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AuthService {
    private UserService userService

    @Autowired
    void setUserService(UserService userService) {this.userService = userService}

    User authUser (String username, String password) {

        User user = userService.findUserByUsername()

        try{
            if(user.getProperty(username).equals(username) && user.getProperty(password).equals(password)) {

                user
            }

        } catch (Exception e) {
            println("User login invalid")
        }
        null
    }

}
