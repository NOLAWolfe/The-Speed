package com.wolfe.speed.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserEventId implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "EVENT_ID")
	private int eventId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public UserEventId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserEventId(int userId, int eventId) {
		super();
		this.userId = userId;
		this.eventId = eventId;
	}

	@Override
	public String toString() {
		return "UserEventId [userId=" + userId + ", eventId=" + eventId + "]";
	}
	
	
}
