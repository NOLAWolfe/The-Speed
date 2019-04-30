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
	private int event_id;

	@Column
	@NotNull
	private String event_name;

	@Column
	@NotNull
	private LocalDateTime timeposted;
	@Column
	@NotNull
	private LocalDateTime timeStart;
	@Column
	@NotNull
	private LocalDateTime timeEnd;

	@Column
	@NotNull
	private String caption;
	@Column
	@NotNull
	private int flag;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "USER_ID")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private int user_id;

	@OneToMany(mappedBy = "EVENT", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<UserEvent> users = new ArrayList<>();

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "ADDRESS_ID")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Address address;

	public int getEvent_id() {
		return event_id;
	}

	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	public Event(int event_id, String event_name, int user_id, LocalDateTime timeposted, LocalDateTime timeStart,
			LocalDateTime timeEnd, Address address, String caption, int flag) {
		super();
		this.event_id = event_id;
		this.event_name = event_name;
		this.user_id = user_id;
		this.timeposted = timeposted;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.address = address;
		this.caption = caption;
		this.flag = flag;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(String event_name, int user_id, LocalDateTime timeposted, LocalDateTime timeStart,
			LocalDateTime timeEnd, Address address, String caption, int flag) {
		super();
		this.event_name = event_name;
		this.user_id = user_id;
		this.timeposted = timeposted;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.address = address;
		this.caption = caption;
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Event [event_id=" + event_id + ", event_name=" + event_name + ", user_id=" + user_id + ", timeposted="
				+ timeposted + ", timeStart=" + timeStart + ", timeEnd=" + timeEnd + ", address=" + address	
				+ ", caption=" + caption + ", flag=" + flag + "]";
	}

}
