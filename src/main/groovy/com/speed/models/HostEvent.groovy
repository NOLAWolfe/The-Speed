package com.speed.models

import com.speed.models.Events.Event
import com.speed.models.Hosts.Host
import groovy.transform.Canonical

import javax.persistence.*

@Entity
@Table(name = "HOST_EVENT")
@Canonical
class HostEvent implements Serializable{

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @Column(name = "ID")
    private HostEventId id;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("userId")
    private Host userId;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("eventId")
    private Event eventId
}
