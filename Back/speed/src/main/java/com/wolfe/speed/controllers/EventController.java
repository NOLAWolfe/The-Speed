package com.wolfe.speed.controllers;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolfe.speed.beans.Event;
import com.wolfe.speed.service.EventService;
@RestController
@CrossOrigin
@RequestMapping(value="/event")
public class EventController {
	
	@Autowired
	private EventService es;
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Event>> getAllEvents(){
		return new ResponseEntity<>(es.findAllEvents(), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public void addEvent(@RequestBody String jsonStr) {
		JSONObject json = new JSONObject(jsonStr);
		es.createEvent(json);
	}
	
	@GetMapping("/byId/{eventId}")
	public ResponseEntity<Event> getEventByEventId(@PathVariable String eventId) {
		Integer eventNumber = Integer.parseInt(eventId);
		return new ResponseEntity<Event>(es.getEventById(eventNumber), HttpStatus.OK);
	}
	
	@GetMapping("byUser/{userId}")
	public ResponseEntity<List<Event>> getEventsByUser(@PathVariable Integer userId) {
		return new ResponseEntity<List<Event>>(es.getEventsByUser(userId), HttpStatus.OK);
	}
}
