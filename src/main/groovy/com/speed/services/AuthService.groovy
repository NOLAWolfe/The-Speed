package com.speed.services


import com.speed.models.Hosts.Host
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AuthService {
    private HostService hostService

    @Autowired
    void setUserService(HostService hostService) {this.hostService = hostService}

    Host authHost (String username, String password) {

        Host host = hostService.findHostByUsername(username)

        try{
            if(host.getProperty(username).equals(username) && host.getProperty(password).equals(password)) {

                host
            }

        } catch (Exception e) {
            println("User login invalid")
        }
        null
    }

}
