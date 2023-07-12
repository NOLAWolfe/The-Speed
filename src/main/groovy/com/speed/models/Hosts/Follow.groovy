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
    @Column(name = "FOLLOPWID")
    private int followId;

    @ManyToMany
    private List<Host> hostFollowed = new ArrayList<>()

    @ManyToMany
    private List<Host> hostFollowing = new ArrayList<>()

    @Column(name = "CREATEDATE")
    private LocalDateTime createDate;
}
