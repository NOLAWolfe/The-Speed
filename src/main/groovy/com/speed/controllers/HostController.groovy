package com.speed.controllers

import com.speed.daos.HostDAO
import com.speed.models.Hosts.Host
import com.speed.services.HostService
import lombok.AllArgsConstructor
import org.apache.coyote.Request
import org.json.JSONObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/host")
@AllArgsConstructor
class HostController {

    @Autowired
    private HostDAO hostDAO

    @Autowired
    private HostService hostService

    @PostMapping("/s")
    ResponseEntity<List<Host>> saveHost(@RequestBody Host host){
        new ResponseEntity<List<Host>>(hostService.createHost(host), HttpStatus.CREATED)
    }

    @GetMapping("/")
    ResponseEntity<List<Host>> getAllHosts() {
        new ResponseEntity<List<Host>>(hostDAO.findAll(), HttpStatus.OK)
    }

    @PostMapping(value = "/ghbu")
    @ResponseBody
    ResponseEntity<Host> getHostByUsername(@RequestBody String username) {
        new ResponseEntity<>(hostService.getHostByUsername(username), HttpStatus.OK)
    }

    @PostMapping(value="/ghbi")
    ResponseEntity<Host> getHostById(@RequestBody String id) {
        new ResponseEntity<Host>(hostService.getHostById(id), HttpStatus.OK)
    }

    @DeleteMapping("/dh")
    ResponseEntity<Host> deleteHost(@RequestBody Host host){
        new ResponseEntity<Host>(hostDAO.delete(host), HttpStatus.OK)
    }
    @DeleteMapping("/dhbi")
    ResponseEntity<List<Host>> deleteByHostId(@RequestBody String id){
        new ResponseEntity<>(hostService.deleteByHostId(id),  HttpStatus.OK)
    }

}
