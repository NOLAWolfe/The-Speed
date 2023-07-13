package com.speed.models.Media


import com.speed.models.Posts.Post
import lombok.Data

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name="POST_MEDIA")
@Data
class PostMedia implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int postMediaId

    @OneToOne
    private Post post

    @OneToOne
    private Media media
}
