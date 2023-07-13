package com.speed.daos


import com.speed.models.Hosts.Host
import org.json.JSONObject
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HostDAO extends JpaRepository<Host, Integer>{

    Host save(Host host)
    List<Host> findAll()
    Host findByHostId(int id)
    Host findByUsername(String username)
    void deleteByHostId(int id)
    void delete(Host host)
}
