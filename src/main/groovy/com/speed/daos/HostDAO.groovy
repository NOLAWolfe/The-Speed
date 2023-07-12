package com.speed.daos


import com.speed.models.Hosts.Host
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HostDAO extends JpaRepository<Host, Integer>{
    Host findByHostId(int hostId)
    Host findByUsername(String username)
}
