package com.wolfe.speed.beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "EVENT")
public class Event implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EVENTID")
	private int eventId;

	@Column(name = "EVENT_NAME")
	@NotNull
	private String event_name;

	@Column(name = "TIMEPOSTED")
	private LocalDateTime timeposted;
	@Column(name = "TIMESTART")
	@NotNull
	private LocalDateTime timeStart;
	@Column(name = "TIMEEND")
	@NotNull
	private LocalDateTime timeEnd;

	@Column(name = "CAPTION")
	@NotNull
	private String caption;
	@Column(name = "FLAG")
	@NotNull
	private int flag;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "USERID")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User userId;

	@OneToMany(mappedBy = "eventId", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<UserEvent> users = new ArrayList<>();

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "ADDRESSID")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Address address;

	public int geteventId() {
		return eventId;
	}

	public void seteventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public User getuserId() {
		return userId;
	}

	public void setuserId(User userId) {
		this.userId = userId;
	}

	public LocalDateTime getTimeposted() {
		return timeposted;
	}

	public void setTimeposted(LocalDateTime timeposted) {
		this.timeposted = timeposted;
	}

	public LocalDateTime getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(LocalDateTime timeStart) {
		this.timeStart = timeStart;
	}

	public LocalDateTime getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(LocalDateTime timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Event(@NotNull String event_name, LocalDateTime timeposted, @NotNull LocalDateTime timeStart,
			@NotNull LocalDateTime timeEnd, @NotNull String caption, @NotNull int flag, User userId, Address address) {
		super();
		this.event_name = event_name;
		this.timeposted = timeposted;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.caption = caption;
		this.flag = flag;
		this.userId = userId;
		this.address = address;
	}

	public Event(int eventId, @NotNull String event_name, @NotNull LocalDateTime timeStart,
			@NotNull LocalDateTime timeEnd, @NotNull String caption, @NotNull int flag, User userId, Address address) {
		super();
		this.eventId = eventId;
		this.event_name = event_name;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.caption = caption;
		this.flag = flag;
		this.userId = userId;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", event_name=" + event_name + ", timeposted=" + timeposted
				+ ", timeStart=" + timeStart + ", timeEnd=" + timeEnd + ", caption=" + caption + ", flag=" + flag
				+ ", userId=" + userId + ", users=" + users + ", address=" + address + "]";
	}

	
}
