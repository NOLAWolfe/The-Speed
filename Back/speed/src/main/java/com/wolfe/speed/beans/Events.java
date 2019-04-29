package com.wolfe.speed.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Events {
	
	private int event_id;
	
	private String event_name;

	private int user_id;
	
	private LocalDate timeposted;
	
	private LocalDateTime timeStart;
	
	private LocalDateTime timeEnd;
	
	private int address_id;
	
	private String caption;
	
	private int flag;

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

	public LocalDate getTimeposted() {
		return timeposted;
	}

	public void setTimeposted(LocalDate timeposted) {
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

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
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

	public Events(int event_id, String event_name, int user_id, LocalDate timeposted, LocalDateTime timeStart,
			LocalDateTime timeEnd, int address_id, String caption, int flag) {
		super();
		this.event_id = event_id;
		this.event_name = event_name;
		this.user_id = user_id;
		this.timeposted = timeposted;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.address_id = address_id;
		this.caption = caption;
		this.flag = flag;
	}

	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Events(String event_name, int user_id, LocalDate timeposted, LocalDateTime timeStart, LocalDateTime timeEnd,
			int address_id, String caption, int flag) {
		super();
		this.event_name = event_name;
		this.user_id = user_id;
		this.timeposted = timeposted;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.address_id = address_id;
		this.caption = caption;
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Events [event_id=" + event_id + ", event_name=" + event_name + ", user_id=" + user_id + ", timeposted="
				+ timeposted + ", timeStart=" + timeStart + ", timeEnd=" + timeEnd + ", address_id=" + address_id
				+ ", caption=" + caption + ", flag=" + flag + "]";
	}
	
	
	
}
