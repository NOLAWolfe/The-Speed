package com.wolfe.speed.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolfe.speed.beans.Address;
import com.wolfe.speed.beans.Event;
import com.wolfe.speed.beans.User;
import com.wolfe.speed.repositories.EventDAO;


@Service
public class EventService {

	@Autowired
	private EventDAO eventDAO;
	
	@Autowired
	private UserService userService;
	
	@Autowired 
	private AddressService addressService;

	public List<Event> findAllEvents() {
		List<Event> eventList = new ArrayList<>();
		eventList = eventDAO.findAll();
		return eventList;
	}

	public void createEvent(JSONObject json) {

		String name = json.getString("event_name");
//		String str = "1986-04-08 12:30";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		
		LocalDateTime timePosted = LocalDateTime.now();

		String timeStart = json.getString("timeStart");
		String[] tsSplit = timeStart.split("(?<=^.{14}) ");
		System.out.println(tsSplit[0]);
		System.out.println(tsSplit[1].trim());
		LocalDateTime dateTimeStart = LocalDateTime.parse(timeStart, formatter);
		
		String timeEnd= json.getString("timeStart");
		String[] teSplit = timeStart.split("(?<=^.{14}) ");
		System.out.println(teSplit[0]);
		System.out.println(teSplit[1].trim());
		LocalDateTime dateTimeEnd = LocalDateTime.parse(timeEnd, formatter);
		
		String caption = json.getString("caption");
		int flag = (int) json.getInt("flag");
		int userId = (int) json.getInt("userId");
		User user = userService.getUserById(userId);
		
		String streetAddress =json.getString("eventAddress");
		String apartment =json.getString("eventApartment");
		String city =json.getString("eventCity");
		String state =json.getString("eventState");
		int zip = (int) json.getInt("eventZip");
		Address address = addressService.checkAddress(new Address(streetAddress,apartment,city,state,zip));
		Event e = new Event(name, timePosted, dateTimeStart, dateTimeEnd, caption, flag, user, address);
		eventDAO.save(e);
		
		Event event = new Event();
		eventDAO.save(event);
	}
	
	public Event getEventById(Integer id) {
		Optional<Event> e = eventDAO.findById(id);
		if (e.isPresent()) {
			return e.get();
		} else {
			return null;
		}
	}
	
	public List<Event> getEventsByUser(Integer id) {
		List<Event> e = new ArrayList<>();
		User user = userService.getUserById(id);
		e = eventDAO.getEventsByuserId(user);
		return e;
	}
}
