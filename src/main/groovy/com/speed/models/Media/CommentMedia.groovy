package com.speed.models.Media

import com.speed.models.Posts.Comment

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
@Table(name="COMMENT_MEDIA")
class CommentMedia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int commentMediaID

    @OneToOne
    private Comment comment

    @OneToOne
    private Media media
}
