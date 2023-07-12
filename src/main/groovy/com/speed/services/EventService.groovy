package com.speed.services

import com.fasterxml.jackson.databind.util.JSONPObject
import com.speed.daos.EventDAO
import com.speed.daos.HostDAO
import com.speed.models.Events.Event
import com.speed.models.Hosts.Host
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EventService {
    @Autowired
    private EventDAO eventDAO
    private HostDAO hostDAO
    private AddressService addressService

    List<Event> findAllEvents() {
        List<Event> eventList = new ArrayList<>()
        eventList = eventDAO.findAll()
        eventList
    }

    void createEvent(JSONPObject json) {

    }

    Event getEventById(int id) {
        Optional<Event> e = eventDAO.findById(id)
        if(e.isPresent()) {
            e.get()
        } else {
            return null
        }
    }

    List<Event> getEventsByHostHostId(int id) {
        List<Event> e = new ArrayList<>()
        Host host = hostDAO.findByHostId(id)
        e = eventDAO.getEventsByHostId(id)
    }
}
