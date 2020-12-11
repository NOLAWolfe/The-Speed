package com.speed.models

import groovy.transform.Canonical

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
}
