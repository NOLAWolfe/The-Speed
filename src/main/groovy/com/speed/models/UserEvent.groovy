package com.speed.models

import groovy.transform.Canonical

import javax.persistence.*

@Entity
@Table(name = "USER_EVENT")
@Canonical
class UserEvent implements Serializable{

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @Column(name = "ID")
    private UserEventId id;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("userId")
    private User userId;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("eventId")
    private Event eventId
}
