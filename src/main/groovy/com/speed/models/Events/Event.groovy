package com.speed.models.Events

import com.speed.models.Postal.Address
import com.speed.models.Hosts.Host
import com.speed.models.Posts.Post
import groovy.transform.Canonical
import org.codehaus.groovy.runtime.ArrayUtil

import javax.validation.constraints.NotNull;
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction

import javax.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "EVENT")
@Canonical
class Event implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EVENTID")
    private int eventId;

    @Column(name = "EVENT_NAME")
    @NotNull
    private String eventName;

    @Column(name = "BODY")
    @NotNull
    private String body;

    @Column(name = "FLAG")
    @NotNull
    private int flag;

    @Column(name = "TIMESTART")
    @NotNull
    private LocalDateTime timeStart;

    @Column(name = "TIMEEND")
    @NotNull
    private LocalDateTime timeEnd;

    @Column(name = "CREATEDATE")
    private LocalDateTime createDate;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Host host;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Post post;

    @OneToOne(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Address address
}
