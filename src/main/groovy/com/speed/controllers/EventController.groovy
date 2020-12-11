package com.speed.controllers

import com.speed.models.Event
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
    private EventService eventService

    @GetMapping("/")
    ResponseEntity<List<Event>> getAllEvents() {
        new ResponseEntity<>(eventService.findAll(), HttpStatus.OK)
    }

    @PostMapping("/")
    void addEvent(@RequestBody String eventJSON){
        JSONObject json = new JSONObject(eventJSON)
        eventService.createEvent(json)
    }

    @PostMapping("/gebi")
    ResponseEntity<Event> getEventByEventId(@RequestBody String eventId) {
        Integer eventID = Integer.parseInt(eventId)
        new ResponseEntity<>(eventService.getEventById(eventID), HttpStatus.OK)
    }

    @PostMapping("/gebu")
    ResponseEntity<List<Event>> getEventsByUserId(@RequestBody Integer userId) {
        new ResponseEntity<List<Event>>(eventService.getEventsByUserId(userId), HttpStatus.OK)
    }
}
