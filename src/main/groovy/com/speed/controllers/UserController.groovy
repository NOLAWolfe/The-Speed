package com.speed.controllers

import com.speed.models.User
import com.speed.services.UserService
import org.apache.coyote.Response
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/user")
class UserController {
    private UserService userService

    @Autowired
    void setUserService(UserService userService) { this.userService = userService }

    @GetMapping("/")
    ResponseEntity<List<User>> getAllUsers() {
        new ResponseEntity<>(userService.findAllUsers(), HttpStatus.OK)
    }

    @PostMapping(value = "/gubu")
    ResponseEntity<User> getUserByUsername(@RequestBody String username) {
        new ResponseEntity<>(userService.findUserByUsername(username), HttpStatus.OK)
    }

    @PostMapping(value="/gubi")
    ResponseEntity<User> getUserById(@RequestBody String userId) {
        int id = Integer.parseInt(userId)
        new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK)
    }

}
