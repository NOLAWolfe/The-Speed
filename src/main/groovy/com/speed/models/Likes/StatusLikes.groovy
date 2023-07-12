package com.speed.models.Likes

import com.speed.models.Hosts.Host
import com.speed.models.Posts.Post
import com.speed.models.Posts.Status

import javax.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name="STATUS_LIKES")
class StatusLikes implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="STATUSLIKEID")
    private int statusLikeID;

    @Column(name="LIKECOUNT")
    private int likeCount;

    @Column(name="HOSTID")
    private Host host;

    @OneToOne
    private Status status;

    @Column(name = "CREATEDATE")
    private LocalDateTime createDate;
}
