package com.speed.models

import groovy.transform.Canonical

import javax.persistence.*

@Embeddable
@Canonical
class UserEventId implements Serializable{

    private static final long serialVersionUID = 1L;

    @Column(name = "userId")
    private int userId;

    @Column(name = "userId")
    private int eventId;

}
