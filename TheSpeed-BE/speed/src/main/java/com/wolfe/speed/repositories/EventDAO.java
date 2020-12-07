package com.wolfe.speed.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wolfe.speed.beans.Event;
import com.wolfe.speed.beans.User;

@Repository
public interface EventDAO extends JpaRepository<Event, Integer> {
	public List<Event> getEventsByuserId(User user);
}
