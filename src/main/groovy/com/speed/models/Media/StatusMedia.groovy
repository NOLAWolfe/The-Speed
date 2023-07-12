package com.speed.models.Media


import com.speed.models.Posts.Status

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne
import javax.persistence.OneToOne
import javax.persistence.Table


@Entity
@Table(name="STATUS_MEDIA")
class StatusMedia implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STATUS_MEDIAID")
    private int statusMediaID

    @OneToOne
    private Status status

    @ManyToMany
    private List<Media> media = new ArrayList<>()
}
