package com.speed.daos


import com.speed.models.Hosts.Host
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HostDAO extends JpaRepository<Host, Integer>{

    Host save(Host host)
    List<Host> findAll()
    Host findByHostId(UUID id)
    List<Host> findByUsername(String username)
    void deleteByHostId(UUID id)
    void delete(Host host)
}
