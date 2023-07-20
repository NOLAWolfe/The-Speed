package com.speed.services

import com.speed.daos.HostDAO
import com.speed.models.Hosts.Host
import lombok.AllArgsConstructor
import org.json.JSONObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter

@Service
@AllArgsConstructor
class HostService {

    @Autowired
    private HostDAO hostDAO

    @Autowired
    void setHostDAO(HostDAO hostDAO) { this.hostDAO = hostDAO }

    List<Host> createHost(Host host) {
        LocalDateTime ldt = LocalDateTime.now()
        host.setCreateDate(ldt)
        hostDAO.save(host)
        List<Host> result = hostDAO.findAll()
        result
    }


    List<Host> findAllHosts() {
        println("Retrieving All Hosts...")
        hostDAO.findAll()
    }

    Host getHostById(String id) {
        JSONObject json = new JSONObject(id)
        Host host = hostDAO.findByHostId(json.getInt("hostid"))
        host
    }

    Host getHostByUsername(String username){
        JSONObject json = new JSONObject(username)
        Host host = hostDAO.findByUsername(json.getString("username"))
        host
    }

    List<Host> deleteByHostId(String id){
        JSONObject json = new JSONObject(id)
        Host host = hostDAO.deleteByHostId(json.getInt("id"))
        hostDAO.findAll()
    }
}
