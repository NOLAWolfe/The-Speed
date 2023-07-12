package com.speed.models.Likes

import com.speed.models.Hosts.Host
import com.speed.models.Posts.Post

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToOne
import javax.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name="POST_LIKES")
class PostLikes implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="POSTLIKEID")
    private int postLikeID;

    @Column(name="LIKECOUNT")
    private int likeCount;

    @Column(name="HOSTID")
    private Host host;

    @OneToOne
    private Post post;

    @Column(name = "CREATEDATE")
    private LocalDateTime createDate;
}
