package com.speed.models

import groovy.transform.Canonical
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction

import javax.persistence.*
import javax.validation.constraints.NotNull
import java.time.LocalDateTime

@Entity
@Table(name = "COMMENT")
@Canonical
class Comment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMMENTID")
    private int commentId;

    @Column(name = "COMMENT")
    @NotNull
    private String comment;
    @Column(name = "FLAG")
    @NotNull
    private int flag;
    @Column(name = "TIMECREATED")
    @NotNull
    private LocalDateTime timeCreated;

    @Column(name = "LIKES", columnDefinition = "int default 0")
    @NotNull
    private int likes;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "USERID")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Host userid;


}
