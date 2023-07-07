package com.speed.controllers


import com.speed.models.Host
import com.speed.services.HostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/host")
class HostController {
    private HostService hostService

    @Autowired
    void setUserService(HostService hostService) { this.hostService = hostService }

    @GetMapping("/")
    ResponseEntity<List<Host>> getAllHosts() {
        new ResponseEntity<>(hostService.findAllHosts(), HttpStatus.OK)
    }

    @PostMapping(value = "/ghbu")
    ResponseEntity<Host> getHostByUsername(@RequestBody String username) {
        new ResponseEntity<>(hostService.findHostByUsername(username), HttpStatus.OK)
    }

    @PostMapping(value="/ghbi")
    ResponseEntity<Host> getHostById(@RequestBody String userId) {
        int id = Integer.parseInt(userId)
        new ResponseEntity<>(hostService.getHostById(id), HttpStatus.OK)
    }

}
