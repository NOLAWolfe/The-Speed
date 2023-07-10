package com.speed.daos

import com.speed.models.Event
import com.speed.models.Host
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EventDAO extends JpaRepository<Event,Integer> {
    List<Event> getEventsByUserId(Host user)
}
