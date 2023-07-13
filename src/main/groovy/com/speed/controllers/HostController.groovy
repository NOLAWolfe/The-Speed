package com.speed.controllers

import com.speed.daos.HostDAO
import com.speed.models.Hosts.Host
import com.speed.services.HostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/host")
class HostController {

    @Autowired
    private HostDAO hostDAO

    @Autowired
    private HostService hostService

    @PostMapping("/s")
    ResponseEntity<Host> saveHost(Host host){
        new ResponseEntity<>(hostDAO.save(host), HttpStatus.OK)
    }

    @GetMapping("/")
    ResponseEntity<List<Host>> getAllHosts() {
        new ResponseEntity<List<Host>>(hostDAO.findAll(), HttpStatus.OK)
    }

    @PostMapping(value = "/ghbu")
    ResponseEntity<List<Host>> getHostByUsername(@RequestBody String username) {
        new ResponseEntity<List<Host>>(hostDAO.findByUsername(username), HttpStatus.OK)
    }

    @PostMapping(value="/ghbi")
    ResponseEntity<Host> getHostById(@RequestBody int hostId) {
        new ResponseEntity<Host>(hostDAO.findByHostId(hostId), HttpStatus.OK)
    }

    @DeleteMapping("/dh")
    ResponseEntity<Host> deleteHost(@RequestBody Host host){
        new ResponseEntity<Host>(hostDAO.delete(host), HttpStatus.OK)
    }
    @DeleteMapping("/dhbi")
    ResponseEntity<Host> deleteByHostId(@RequestBody int id){
        new ResponseEntity<Host>(hostDAO.deleteByHostId(id),  HttpStatus.OK)
    }

}
