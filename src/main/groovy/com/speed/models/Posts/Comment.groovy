package com.speed.models.Posts

import com.speed.models.Hosts.Host
import com.speed.models.Likes.CommentLikes
import com.speed.models.Media.CommentMedia
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


    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Host host;

    @NotNull
    @ManyToOne
    private Post post

    @Column(name = "BODY")
    @NotNull
    private String body;

    @Column(name = "FLAG")
    @NotNull
    private int flag;

    @Column(name = "CREATEDATE")
    @NotNull
    private LocalDateTime createDate;

    @OneToOne
    private CommentMedia commentMedia;

    @OneToOne
    @NotNull
    private CommentLikes commentLikes;

}
