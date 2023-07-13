package com.speed.daos

import com.speed.models.Events.Event
import com.speed.models.Hosts.Host
import com.sun.xml.bind.v2.TODO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EventDAO extends JpaRepository<Event,Integer> {
//    TODO: For NOW use DAOS directly in controller for lack of businesslogic
    // Service layer will be updated to include: Logging / InDepth Logic / Etc


    Event save(Event event)
    List<Event> findAll()
    Event findByEventId(int id)
    List<Event> findByHostHostId(UUID id)
    void deleteByEventId(int id)
    void delete(Event event)
}
