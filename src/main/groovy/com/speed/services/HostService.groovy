package com.speed.services

import com.speed.daos.HostDAO
import com.speed.models.Hosts.Host
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HostService {
    private HostDAO hostDAO

    @Autowired
    void setHostDAO(HostDAO hostDAO) { this.hostDAO = hostDAO }
//
//    List<Host> findAllHosts() {
//        println("Retrieving All Hosts...")
//        hostDAO.findAll()
//    }
//
//    Host getHostById(int id) {
//        println("Retrieving Host By Id: " + id)
//        hostDAO.getByHostid(id)
//        println("User Retrieved: " + hostDAO.getByUserid(id))
//    }
//
//    void createHost(Host host) { hostDAO.save(host) }
//
//    Host findHostByUsername(String username) { hostDAO.getByUsername(username) }

}
