package com.speed.daos

import com.speed.models.Events.Event
import com.speed.models.Hosts.Host
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EventDAO extends JpaRepository<Event,Integer> {

    List<Event> findEventsByHostHostId(int hostId)
}
