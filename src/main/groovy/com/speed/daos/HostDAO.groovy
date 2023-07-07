package com.speed.daos


import com.speed.models.Host
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HostDAO extends JpaRepository<Host, Integer>{
    Host getByUserid(int userId)
    Host getByUsername(String username)
}
