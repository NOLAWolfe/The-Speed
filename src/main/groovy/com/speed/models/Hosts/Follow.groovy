package com.speed.models.Hosts

import com.speed.models.Media.Media
import com.speed.models.Posts.Comment

import javax.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name="FOLLOW")
class Follow implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int followId;

    @ManyToOne
    private Host followedHost

    @ManyToOne
    private Host followingHost

    @Column(name = "CREATEDATE")
    private LocalDateTime createDate;
}
