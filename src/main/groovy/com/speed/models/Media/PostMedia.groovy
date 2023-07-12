package com.speed.models.Media


import com.speed.models.Posts.Post

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
@Table(name="POST_MEDIA")
class PostMedia implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "POST_MEDIAID")
    private int postMediaID

    @OneToOne
    private Post post

    @ManyToMany
    private List<Media> media = new ArrayList<>()
}
