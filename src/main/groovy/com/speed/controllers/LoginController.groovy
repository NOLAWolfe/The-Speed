package com.speed.controllers

import com.speed.models.Host
import com.speed.services.AuthService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value="/login")
class LoginController {
    private AuthService authService

    @Autowired
    LoginController(AuthService authService){ this.authService = authService }

    @CrossOrigin(origins="http://localhost:4200")
    @PostMapping(value="/attemptLogin")
    ResponseEntity<Host> LoginRequest(@RequestBody Host user){
        new ResponseEntity<>(authService.authUser(user), HttpStatus.OK)
    }
}
