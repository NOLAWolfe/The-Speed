package com.speed.controllers

import com.speed.daos.EventDAO
import com.speed.models.Events.Event
import com.speed.services.EventService
import org.json.JSONObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
@RequestMapping(value="/event")
class EventController {

    @Autowired
    private EventDAO eventDAO

//    @Autowired
//    void setEventService(EventService eventService) {this.eventDAO = eventService}

    @PostMapping("/se")
    void saveEvent(@RequestBody Event event){
        new ResponseEntity<Event>(eventDAO.save(event), HttpStatus.ACCEPTED)
    }

    @GetMapping("/a")
    ResponseEntity<List<Event>> getAllEvents() {
        new ResponseEntity<List<Event>>(eventDAO.findAll(), HttpStatus.OK)
    }

    @PostMapping("/gebi")
    ResponseEntity<Event> getEventById(@RequestBody int id) {
        new ResponseEntity<Event>(eventDAO.findByEventId(id), HttpStatus.OK)
    }

    @PostMapping("/gebhi")
    ResponseEntity<List<Event>> getEventsByHostId(@RequestBody UUID userId) {
        new ResponseEntity<List<Event>>(this.eventDAO.findByHostHostId(userId), HttpStatus.OK)
    }
    @PostMapping("/debi")
    ResponseEntity<Event> deleteEventsByEventId(@RequestBody int userId) {
        new ResponseEntity<Event>(this.eventDAO.deleteByEventId(userId), HttpStatus.OK)
    }
    @PostMapping("/gebu")
    ResponseEntity<Event> deleteEvent(@RequestBody Event event) {
        new ResponseEntity<Event>(this.eventDAO.delete(event), HttpStatus.OK)
    }


}
