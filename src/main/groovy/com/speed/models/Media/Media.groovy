package com.speed.models.Media

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="MEDIA")
class Media implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEDIAID")
    private int mediaId;

    @Column(name="MEDIATYPE")
    private String mediaType

    @Column(name="MEDIAURL")
    private String mediaURL


}
