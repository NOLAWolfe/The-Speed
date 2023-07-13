package com.speed.models.Posts

import com.speed.models.Events.Event
import com.speed.models.Hosts.Host
import com.speed.models.Likes.PostLikes
import com.speed.models.Media.PostMedia
import groovy.transform.Canonical

import javax.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "POST")
@Canonical
class Post implements Serializable{
    private static final long serialVersionUID = 2028103581041053472L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private UUID postId;

    @Column(name="BODY")
    private String body;

    @Column(name="CREATEDATE")
    private LocalDateTime createDate

    @OneToOne
    private PostLikes postLikes;

    @OneToOne
    private PostMedia postMedia

    @OneToOne
    private Event event

    @ManyToOne
    private Host host

}
