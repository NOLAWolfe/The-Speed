package com.speed.models.Posts

import com.speed.models.Events.Event
import com.speed.models.Hosts.Host
import com.speed.models.Likes.PostLikes
import com.speed.models.Media.PostMedia
import groovy.transform.Canonical

import javax.persistence.*
import javax.validation.constraints.NotNull
import java.time.LocalDateTime

@Entity
@Table(name = "POST")
@Canonical
class Post implements Serializable{
    private static final long serialVersionUID = 2028103581041053472L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int postId;

    @Column(name="BODY")
    @NotNull
    private String body;

    @Column(name="CREATEDATE")
    @NotNull
    private LocalDateTime createDate

    @OneToOne
    private PostLikes postLikes;

    @OneToOne
    private PostMedia postMedia

    @OneToOne
    private Event event

    @ManyToOne(cascade = CascadeType.ALL)
    private Host host


    int getPostId() {
        return postId
    }

    void setPostId(int postId) {
        this.postId = postId
    }

    String getBody() {
        return body
    }

    void setBody(String body) {
        this.body = body
    }

    LocalDateTime getCreateDate() {
        return createDate
    }

    void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate
    }

    PostLikes getPostLikes() {
        return postLikes
    }

    void setPostLikes(PostLikes postLikes) {
        this.postLikes = postLikes
    }

    PostMedia getPostMedia() {
        return postMedia
    }

    void setPostMedia(PostMedia postMedia) {
        this.postMedia = postMedia
    }

    Event getEvent() {
        return event
    }

    void setEvent(Event event) {
        this.event = event
    }

    Host getHost() {
        return host
    }

    void setHost(Host host) {
        this.host = host
    }
}
