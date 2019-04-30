package com.wolfe.speed.beans;

import java.io.Serializable;

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
	private UserEventId id;

	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("USER_ID")
	private User user;

	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("EVENT_ID")
	private Event event;

	public UserEventId getId() {
		return id;
	}

	public void setId(UserEventId id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public UserEvent(UserEventId id, User user, Event event) {
		super();
		this.id = id;
		this.user = user;
		this.event = event;
	}

	public UserEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserEvent(User user, Event event) {
		super();
		this.user = user;
		this.event = event;
	}

	@Override
	public String toString() {
		return "UserEvent [id=" + id + ", user=" + user + ", event=" + event + "]";
	}

	
}
