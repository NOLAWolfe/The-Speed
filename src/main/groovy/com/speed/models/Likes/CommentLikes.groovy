package com.speed.models.Likes

import com.speed.models.Hosts.Host
import com.speed.models.Posts.Comment
import com.speed.models.Posts.Post

import javax.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name="COMMENT_LIKES")
class CommentLikes implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private int commentLikeID;

    @Column(name="LIKECOUNT")
    private int likeCount;

    @Column(name="HOSTID")
    private Host host;

    @OneToOne
    private Comment comment;

    @Column(name = "CREATEDATE")
    private LocalDateTime createDate;
}
