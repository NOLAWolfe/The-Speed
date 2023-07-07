package com.speed.services

import com.speed.daos.HostDAO
import com.speed.models.Host
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AddressService {
    HostDAO userDAO

    @Autowired
    void setUserDAO(HostDAO userDAO) { this.userDAO = userDAO}

    List<Host> findAllUsers(){ userDAO.findAll()}

    Host getUserById(int id) { userDAO.getByUserid()}
    void createUser(Host user) { userDAO.save(user)}
    Host findUserByUsername(String username) {userDAO.getByUsername()}

}
