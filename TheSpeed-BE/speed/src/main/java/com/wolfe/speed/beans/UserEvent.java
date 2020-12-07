package com.wolfe.speed.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "USER_EVENT")
public class UserEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	@Column(name = "ID")
	private UserEventId id;

	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("userId")
	private User userId;

	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("eventId")
	private Event eventId;

	public UserEventId getId() {
		return id;
	}

	public void setId(UserEventId id) {
		this.id = id;
	}

	public User getUser() {
		return userId;
	}

	public void setUser(User user) {
		this.userId = user;
	}

	public Event getEvent() {
		return eventId;
	}

	public void setEvent(Event event) {
		this.eventId = event;
	}

	public UserEvent(UserEventId id, User user, Event event) {
		super();
		this.id = id;
		this.userId = user;
		this.eventId = event;
	}

	public UserEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserEvent(User user, Event event) {
		super();
		this.userId = user;
		this.eventId = event;
	}

	@Override
	public String toString() {
		return "UserEvent [id=" + id + ", user=" + userId + ", event=" + eventId + "]";
	}

	
}
