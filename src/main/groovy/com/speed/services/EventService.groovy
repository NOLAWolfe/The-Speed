package com.speed.services

import com.fasterxml.jackson.databind.util.JSONPObject
import com.speed.daos.EventDAO
import com.speed.models.Event
import com.speed.models.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EventService {
    @Autowired
    private EventDAO eventDAO
    private UserService userService
    private AddressService addressService

    List<Event> findAllEvents() {
        List<Event> eventList = new ArrayList<>()
        eventList = eventDAO.findAll()
        eventList
    }

    void createEvent(JSONPObject json) {

    }

    Event getEventById(Integer id) {
        Optional<Event> e = eventDAO.findById(id)
        if(e.isPresent()) {
            e.get()
        } else {
            return null
        }
    }

    List<Event> getEventsByUserId(Integer id) {
        List<Event> e = new ArrayList<>()
        User user = userService.getUserById(id)
        e = eventDAO.getEventsByUserId(user)
    }
}
