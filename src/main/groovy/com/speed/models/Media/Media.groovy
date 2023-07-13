package com.speed.models.Media

import com.speed.models.Posts.Comment
import com.speed.models.Posts.Status
import lombok.Data

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
@Table(name="MEDIA")
@Data
class Media implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int mediaId;

    @Column(name="MEDIATYPE")
    private String mediaType

    @Column(name="MEDIAURL")
    private String mediaURL

    @OneToOne
    private HostMedia hostMedia
    @OneToOne
    private PostMedia postMedia
    @OneToOne
    private CommentMedia commentMedia
    @OneToOne
    private StatusMedia statusMedia




}
