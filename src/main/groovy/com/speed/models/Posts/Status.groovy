package com.speed.models.Posts

import com.speed.models.Events.Event
import com.speed.models.Hosts.Host
import com.speed.models.Likes.PostLikes
import com.speed.models.Media.PostMedia
import com.speed.models.Media.StatusMedia
import groovy.transform.Canonical

import javax.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "STATUS")
@Canonical
class Status implements Serializable{
    private static final long serialVersionUID = 2028103581041053472L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int postId;

    @Column(name="BODY")
    private String body;

    @Column(name="POSTLIKES")
    private PostLikes postLikes;

    @Column(name="CREATEDATE")
    private LocalDateTime createDate

    @OneToOne
    private StatusMedia statusMedia

    @ManyToOne
    private Host host

}
