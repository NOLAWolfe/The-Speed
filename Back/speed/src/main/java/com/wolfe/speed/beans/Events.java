package com.wolfe.speed.beans;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Id;

public class Events {
	
	@Id
	@Column(name = "EVENT_ID")
	private int eventId;
//	@Column(name = "DATE_POSTED")
//	private LocalDate date_posted;
	@Column(name = "CAPTION")
	private String caption;
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public Events(int eventId, String caption) {
		super();
		this.eventId = eventId;
		this.caption = caption;
	}
	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Events [eventId=" + eventId + ", caption=" + caption + "]";
	}
	
	
}
